package zz.something.JavaMarathon.Day9;

public class Student extends Human {

    String groupName;

    public Student (String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

//    @Override
//    public String printInfo(){
//        System.out.println(super.printInfo());
//        return "Этот студент с именем " + getName();
//    }

// можно ли вывести две строчки как в задаче, если printInfo написать через return
    @Override
    public String printInfo() {
        return super.printInfo() + "Этот студент с именем " + getName();
    }
}
