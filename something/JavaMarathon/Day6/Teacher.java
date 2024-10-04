package zz.something.JavaMarathon.Day6;

public class Teacher {

    private static String name;
    private static String subject;

    public Teacher(String name, String subject) {
        Teacher.name = name;
        Teacher.subject = subject;
    }

    public void evaluate(Student student) {
        int mark = (int) (2 + 3 * Math.random());
        String markWord = switch (mark) {
            case 2 -> "неудовлетворительно";
            case 3 -> "удовлетворительно";
            case 4 -> "хорошо";
            case 5 -> "отлично";
            default -> null;
        };
        System.out.println("Препродователь " + Teacher.name + " оценил студента " +
                "с именем " + Student.getName() + " по предмету " + Teacher.subject +
                " на оценку " + markWord);
    }
}