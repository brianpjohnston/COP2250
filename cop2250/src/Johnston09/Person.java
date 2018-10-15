package Johnston09;

/**
 *  Brian Johnston
 * 2019405
 * Chapter9
 * Assignment in text document labeled requirements
 * Collaborators: None
 */
public class Person {

    //declaring variables
    public static int numFriends = 0;
    private String fullName;
    private char gender;
    private int age;


    //constructor for perosn
    Person(String name, char gend, int inputedAge) {
        fullName = name;
        gender = gend;
        age = inputedAge;
        numFriends++;
    }

    //get statements for full name, gender and age
    String getFullName() {
        return this.fullName;
    }

    //setting fullname, gender and age
    void setFullName(String name) {
        fullName = name;
    }

    char getgender() {
        return this.gender;
    }

    int getAge() {
        return this.age;
    }

    void setAge(int age) {
        this.age = age;

    }

    void setgender(char gender) {
        this.gender = gender;
    }

    //to string method creates a string with the state of person attributes.
    public String toString() {
        String results = "Person fullName=" + fullName + " gender=" + gender + " age=" + age;
        return results;

    }



}
