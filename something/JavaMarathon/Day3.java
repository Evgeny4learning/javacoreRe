package zz.something.JavaMarathon;

import java.util.Scanner;

public class Day3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Введите название города для определения" +
                    " страны:");
            System.out.println("(Stop для выхода)");

            String cityName = scanner.next();
            if (cityName.equals("Stop")) {
                System.out.println("Программа остановлена");
                break;
            } else {
                switch (cityName) {
                    case "Москва", "Владивосток", "Ростов":
                        System.out.println(cityName + " - это Россия");
                        break;
                    case "Рим":
                    case "Милан":
                    case "Турин":
                        System.out.println(cityName + " - это Италия");
                        break;
                    case "Ливерпуль", "Манчестер", "Лондон":
                        System.out.println(cityName + " - это Англия");
                        break;
                    case "Берлин":
                    case "Мюнхен":
                    case "Кёльн":
                        System.out.println(cityName + " - это Германия");
                        break;
                    case "Курган":
                        System.out.println(cityName + " - филиал АДА !!!");
                        break;
                    default:
                        System.out.println("Неизвестная страна");
                        break;
                }
            }

        }
    }
}
