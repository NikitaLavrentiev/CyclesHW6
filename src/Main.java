public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
// С помощью цикла for выведите в консоль все числа от 1 до 10.
        System.out.println("\nЗадача 1");
        for (int i = 0; i <= 10; i++)
            System.out.println(i);
    }

    public static void task2() {
// С помощью цикла for выведите в консоль все числа от 10 до 1.
        System.out.println("\nЗадача 2");
        for (int i = 10; i >= 1; i--)
            System.out.println(i);
    }

    public static void task3() {
        //Выведите в консоль все четные числа от 0 до 17.
        System.out.println("\nЗадача 3");

        for (int i = 0; i <= 17; i = i + 2)
            System.out.println(i);
    }

    public static void task4() {
//Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        System.out.println("\nЗадача 4");
        for (int i = 10; i >= -10; i--)
            System.out.println(i);
    }

    public static void task5() {
//Напишите программу, которая выводит в консоль все високосные года,
// начиная с 1904 года до 2096. В консоль результат должен выводиться в формате: «… год является високосным».
        System.out.println("\nЗадача 5");
        for (int i = 1904; i <= 2096; i = i + 4)
            System.out.println(i + " год является високосным");

    }

    public static void task6() {
        //Напишите программу, которая выводит в консоль последовательность чисел:
        //
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        System.out.println("\nЗадача 6");
        for (int i = 7; i <= 98; i = i + 7)
            System.out.println(i);
    }

    public static void task7() {
        //Напишите программу, которая выводит в консоль последовательность чисел:
        //
        //1 2 4 8 16 32 64 128 256 512
        System.out.println("\nЗадача 7");
        for (int i = 1; i <= 512; i = i * 2)
            System.out.println(i);
    }

    public static void task8() {
        System.out.println("\nЗадача 8");
        //Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        //
        //Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        System.out.println("\nЗадача 9");
        int b = 0;
        for (int i=1; i<=12; i++)
            System.out.println("Месяц " + i + " сумма накоплений равна " + (b=b+29000) + " рублей");

    }

    public static void task9() {
        //Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых.
        // Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        System.out.println("\nЗадача 9");
        int b = 0;
        int c = b
        for (int i=1; i<=12; i++)
            System.out.println("Месяц " + i + " сумма накоплений равна " + (b+=29000+(b*0.01)) + " рублей"); //переписать код, плнять что есть "c"

    }

    public static void task10() {
        System.out.println("\nЗадача 10");
    }
}