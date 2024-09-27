package zz.something.dataTypes;

public class Datatype {

        public static void main(String[] args) {
// Целые числа
// Объявите переменную типа byte и присвойте ей значение 50
            byte smallNumber = 50;// Ваш код здесь
// Объявите переменную типа short и присвойте ей значение 20000
            short mediumNumber = 20000;// Ваш код здесь
// Объявите переменную типа int и присвойте ей значение 500000
            int largeNumber = 500000;// Ваш код здесь
// Объявите переменную типа long и присвойте ей значение 20000000000L
            long hugeNumber = 2000000000L;// Ваш код здесь
// Числа с плавающей точкой
// Объявите переменную типа float и присвойте ей значение 20.5f
            float floatNumber = 20.5f;// Ваш код здесь
// Объявите переменную типа double и присвойте ей значение 30.5
            double doubleNumber = 30.5;// Ваш код здесь
// Символы
// Объявите переменную типа char и присвойте ей значение 'B'
            char character = 'B';// Ваш код здесь
// Логические значения
// Объявите переменную типа boolean и присвойте ей значение false
            boolean isTrue = false; // Ваш код здесь
// Строки
// Объявите переменную типа String и присвойте ей значение "Alice"
                    String name = "Alice";// Ваш код здесь
// Массивы
// Объявите массив типа int и инициализируйте его значениями {1, 2, 3, 4, 5}
            int[] numbers = {1,2,3,4,5};// Ваш код здесь
// Объявите массив типа String и инициализируйте его значениями {"Alice", "Bob",
                    String[] names = {"JD","Bobo"};// Ваш код здесь
// Вывод значений переменных
                    System.out.println("Значение byte: " + smallNumber);
            System.out.println("Значение short: " + mediumNumber);
            System.out.println("Значение int: " + largeNumber);
            System.out.println("Значение long: " + hugeNumber);
            System.out.println("Значение float: " + floatNumber);
            System.out.println("Значение double: " + doubleNumber);
            System.out.println("Значение char: " + character);
            System.out.println("Значение boolean: " + isTrue);
            System.out.println("Значение String: " + name);
// Вывод значений массивов
            System.out.print("Значения массива int: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
            System.out.print("Значения массива String: ");
            for (String n : names) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

