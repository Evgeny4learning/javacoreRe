package zz.something.JavaMarathon.Day9;

public class Day9_1 {

    public static void main(String[] args) {
        Student st1 = new Student("Jojo", "122");
        System.out.println(st1.getGroupName());
        st1.printInfo();

        System.out.println();

        Teacher th1 = new Teacher("Obi Van", "dark powers");
        System.out.println(th1.getSubject());
        th1.printInfo();
    }
}
