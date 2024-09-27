package zz.something.ComparisonOperators;

public class AllComparisonOperators {

    public static void main(String[] args) {
        Integer a = new Integer(10);
        Integer b = new Integer(10);

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        if (a == b) {
            System.out.println("a and b point to the same objects");
        } else {
            System.out.println("a and b point to the different objects");
        }

        if (str1.equals(str2)) {
            System.out.println("str1 and str2 has same content");
        } else {
            System.out.println("str1 and str2 has different content");
        }

        biggerNumb();
        isEqual(10, 10);
        System.out.println("");
        isEqual(20, 30);
        System.out.println("");
        isStringsEqual("hi", "hi");
        System.out.println("");
        isStringsEqual(new String("hellooo"), new String("hellooo"));
        ageChecker(5);
        ageChecker(18);
        ageChecker(999);
        isEven(5);
        isEven(8);
        positiveNegative(123);
        positiveNegative(-123);
        positiveNegative(0);
    }

    static void biggerNumb() {
        int a = 15;
        int b = 25;

        if (a > b) {
            System.out.println("bigger is a " + a);
        } else {
            System.out.println("bigger is b " + b);
        }
    }

    static void isEqual(int a, int b) {
//        int a = 10;
//        int b = 10;

        if (a == b) {
            System.out.printf("a truly equal b");
        } else {
            System.out.printf("a not really equal b");
        }
    }

    static void isStringsEqual(String str1, String str2) {
        if (str1 == str2) {
            System.out.println("== means same link");
        } else {
            System.out.println("== is different links");
        }

        if (str1.equals(str2)) {
            System.out.println("strings equals");
        } else {
            System.out.println("not equals");
        }
    }

    static void ageChecker(int age) {
        if (age >= 18) {
            System.out.println("chel " + age + " is adult");
        } else {
            System.out.println("chel still a child");
        }
    }

    static void isEven(int a) {
        if (a % 2 == 0) {
            System.out.println("number " + a + " is even");
        } else {
            System.out.println(a + " not even");
        }
    }

    static private void positiveNegative(int a) {
        if (a > 0) {
            System.out.println(a + " is positive");
        } else if (a < 0) {
            System.out.println(a + " is negative");
        } else {
            System.out.println(a + " is zero");
        }
    }
}
