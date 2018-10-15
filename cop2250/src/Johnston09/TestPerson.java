package Johnston09;

/**
 * Brian Johnston
 * 2019405
 * Chapter9
 * Assignment in text document labeled requirements
 * Collaborators: None
 */
public class TestPerson {
    public static void main(String[] args) {


        //creating persons
        Person person1 = new Person("Otto Mattik", 'M', 22);
        Person person2 = new Person("Anna Bollick", 'F', 19);
        Person person3 = new Person("Dick Tator", 'M', 33);

        //adding persons to array
        Person[] personArray = {person1, person2, person3};

        //outputting persons
        System.out.println("Three people at first");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

        //changing name
        changeName(person2);
        //outputting header
        System.out.println("\nThree persons after 5 years");

        //changing age and oututting persons
        agePersons(personArray, 5);

        //oututting num of friends
        System.out.println("\nWe created " + Person.numFriends + " Person objects");


    }

    //changing name method for Anna
    public static void changeName(Person p) {
        p.setFullName("Anna Bollick-Mattik");


    }

    //changing age of persons and outputting
    public static Person[] agePersons(Person[] ara, int yrs) {
        for (Person p : ara) {
            int years = yrs + p.getAge();
            p.setAge(years);
            System.out.println(p.toString());

        }
        return ara;


    }


}
