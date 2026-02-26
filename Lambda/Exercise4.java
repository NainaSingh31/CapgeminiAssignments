package Lambda;

//Instance creation using Method Reference

public class Exercise4 {
    public static void main(String[] args) {

        StudentFactory factory = Student::new;

        Student s1 = factory.create();
        s1.setName("Naina");
        s1.setAge(20);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}