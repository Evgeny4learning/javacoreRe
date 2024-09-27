package zz.something.studentInstitution;

public class Student extends Institution {

    static boolean stillStudying = true;

    long id;
    String name;
    int[] grades;
    Institution ins;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getStudentName(long id) {
        return name;
    }

    public String fromWhere(long id) {
        return Institution.nameOfInstitution;

    }

    public String setFromWhere(long id) {
        return "sd";
    }

    public void setGrades() {}


    public int[] showGrades(long id) {
        return grades;
    }

    public static void startParty() {
        System.out.println('P');
        System.out.println('A');
        System.out.println('R');
        System.out.println('T');
        System.out.println('Y');
        System.out.println('!');
    }

}
