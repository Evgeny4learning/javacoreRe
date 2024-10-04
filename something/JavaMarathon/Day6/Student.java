package zz.something.JavaMarathon.Day6;

public class Student {

    private static String name;

    public Student(String name) {
        Student.name = name;
    }

    public static String getName() {
        return name;
    }
}
