public class PersonTest {

    public static void main(String[] args) {
        // Create persons
        Person person1 = new Person("Shinichi Kudo", "Beika Town, 2nd Block");
        Student student1 = new Student("mr. Robot", "Somewhere on dark web", "Cyber Security", 2, 2000.0);
        Staff staff1 = new Staff("Maman Racing", "Otista III", "High School", 3000.0);

        // Display person information
        System.out.println("Person 1:");
        System.out.println(person1);
        System.out.println();

        // Display student information
        System.out.println("Student 1:");
        System.out.println(student1);
        System.out.println();

        // Display staff information
        System.out.println("Staff 1:");
        System.out.println(staff1);
    }
}

