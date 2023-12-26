package encapsulation;

public class enc {
    public static void main(String[] args) {

        Student student = new Student();

        // Set student information using setter methods
        student.setName("John Doe");
        student.setAge(25);

        // Retrieve and display student information using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

    }
}

class Student {
    private String name;
    private int age;

    // Getter and Setter methods for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}