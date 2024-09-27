package zz.something.studentInstitution;

public class Institution {

    static String address;
    static String nameOfInstitution;

    int roomNumber;
    String g;
    Student st;

    public void setAddressOfInstitution (String address){
        Institution.address = address;
    }

    public void getAddressOfInstitution() {
        System.out.println("Address is " + address);
    }

    public void acceptStudent() {
        //тут охото бы сделать привязку универ нейм к студенту
    }
}
