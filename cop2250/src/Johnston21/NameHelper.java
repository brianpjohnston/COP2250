package Johnston21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Brian on 11/21/16.
 */
public class NameHelper {

    Map<String, Map<String, Integer>> boysByYear = new HashMap<>();
    Map<String, Map<String, Integer>> girlsByYear = new HashMap<>();




    public boolean isNamePresent(String name, String gender){
        String normalizedName = name.toLowerCase();
        boolean present = false;
        switch (gender){
            case "F":
                present = girlsByYear.entrySet().stream().anyMatch(stringMapEntry -> stringMapEntry.getValue().containsKey(normalizedName));
                break;
            case "M":
                present = boysByYear.entrySet().stream().anyMatch(stringMapEntry -> stringMapEntry.getValue().containsKey(normalizedName));
                break;
            default:
                System.out.println("Gender Not Defined");
        }
        return present;
    }


    public void load() {
        // looking for 4 digits in the file name
        final Pattern p = Pattern.compile("\\d{4}");
        // list all the files in the data directory
        try {
            Files.list(Paths.get("src/data"))
                    .forEach(
                            path -> {
                                //System.out.println(path);
                                final String fileName = path.getFileName().toString();
                                final Matcher matcher = p.matcher(fileName);
                                // test to see if we can find year date in filename
                                if (matcher.find()) {
                                    final String year = matcher.group(0);
                                    try {
                                        // for every line in the file
                                        Files.lines(path).forEach(line -> {
                                            //NAME, GENDER, YEAR
                                            final String[] parts = line.split(",");
                                            final String name = parts[0].toLowerCase(); // store name data as lowercase
                                            final String gender = parts[1].toLowerCase(); // just normalization here
                                            final int count = Integer.valueOf(parts[2]); // hopefully we don't have runtime error parsing ints
                                            switch (gender) {
                                                case "f":
                                                    // put in female map
                                                    updateGenderMap(girlsByYear, year, name, count);
                                                    break;
                                                case "m":
                                                    // put in male map
                                                    updateGenderMap(boysByYear, year, name, count);
                                                    break;
                                                default:
                                                    //noop
                                                    System.out.println("error parsing");
                                                    break;
                                            }

                                        });
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                    );
        }catch (IOException e2){
            e2.printStackTrace();
        }

    }

    private void updateGenderMap(Map<String, Map<String, Integer>> map, String year, String name, int count) {

        if(map.containsKey(year)) {
            map.get(year).put(name, count);

        } else {
            Map<String, Integer> nameToCount = new HashMap<>();
            nameToCount.put(name,count);
            map.put(year, nameToCount);
        }
    }
    int getRank(String year, String name, String gender){
        int result = 0;

        if (gender == "M"){
            result = boysByYear.get(year).get(name.toLowerCase());

        }else {
            result = girlsByYear.get(year).get(name.toLowerCase());
        }

        return result;

    }
    public Set<String> getYears(){
        return new TreeSet<>(boysByYear.keySet());

    }
}
