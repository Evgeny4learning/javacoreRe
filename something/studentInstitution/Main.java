package zz.something.studentInstitution;

public class Main {

    public static void main(String[] args) {

        Institution MIT = new Institution();
        MIT.setAddressOfInstitution("vokzalnaya schtrasse");
        MIT.getAddressOfInstitution();

        Student st1 = new Student(1, "Jango");
        Student st2 = new Student(2, "Thomas");

        st1.fromWhere(1);
        //st1.setGrades;

        //Student.startParty();

    }
}
