package zz.something.dataTypes;

import java.util.Scanner;

public class Notebook {
    private static final Scanner scanner = new Scanner(System.in);
    //Объявите Массив типа String для хранения имен
    private static String[] names = new String[3];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" ");
            System.out.println("1 Show all names");
            System.out.println("2 Add name");
            System.out.println("3 Rename some");
            System.out.println("4 Remove name");
            System.out.println("5 Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                    case 1:
                        //todo удалить првоерку

                        if (names.length != 0) {
                            printAllNames();
                        } else {
                            System.out.println("No name, add some before");
                        }
                    break;

                case 2:
                    addName();
                    break;

                case 3:
                    renameName();
                    break;

                case 4:
                    deleteName();
                    break;

                case 5:
                    //bad practice  - just use return
                    System.exit(0);

                default:
                    System.out.println("Wrong choice. Give correct number (1-5)");
            }
        }
    }

    private static void printAllNames() {
        for (int i = 0; i < count; i++) {
            System.out.println(names[i]);
        }
    }

    private static void addName() {
        if (count < names.length) {
            System.out.println("Input name:");
            String name = scanner.nextLine();
            names[count] = name;
            count++;
        }
    }

    private static void renameName() {


        System.out.println("Input name which need to be renamed:");
        String currentName = scanner.nextLine();
        System.out.println("Input new name");
        String newName = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            //"test".equals(currentName)
            if (names[i].equals(currentName)) {
                names[i] = newName;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Name changed. Now: " + newName);
        } else {
            System.out.println("No such name");
        }

    }

    private static void deleteName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input name which need to be deleted:");
        String currentName = scanner.nextLine();

        boolean found = false;
        int count = names.length;

        for (int i = 0; i < count; i++) {
            if (names[i].equals(currentName)) {
                found = true;
                for (int j = i; j < count - 1; j++) {
                    names[j] = names[j + 1];
                }
                names[count - 1] = null;
                break;
            }
        }

        if (found) {
            System.out.println("Name " + currentName + " deleted");
        } else {
            System.out.println("No such name");
        }

    }
}
