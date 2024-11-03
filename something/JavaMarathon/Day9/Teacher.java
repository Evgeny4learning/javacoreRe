package zz.something.JavaMarathon.Day9;

public class Teacher extends Human {

    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

//    @Override
//    public void printInfo() {
//        super.printInfo();
//        System.out.println("Этот преподаватель с именем " + getName());
//    }
    public String printInfo() {
//        super.printInfo();
//        System.out.println("Этот преподаватель с именем " + getName());
        return super.printInfo() + "Этот преподаватель с именем " + getName();
    }
}
