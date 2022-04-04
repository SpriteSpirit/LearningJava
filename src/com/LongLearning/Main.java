package com.LongLearning; // пакет каталога

import java.util.Scanner;

import static java.lang.System.in;

public class Main {     // метод класса Main, этот класс может быть использован другими методами и классами
    // все функции, которые находятся внутри класса, называются методами
    public static void main(String[] args) {  // функция (метод) класса
        byte variables = 125; // примитивный тип данных, <тип переменной> <имя переменной>
    /*
    1 правило: программа должна расходовать как можно меньше памяти
    2 правило: программа должна работать как можно быстрее
     */
        short a; // объявление переменной
        a = 120;
        int A, B;
        A = 321654;
        B = A; //перезаписываем значение переменной
        short b = 5; // объявление с инициализацией
        boolean isTrue = true, isFalse = false;
        float half = 5.5f;
        double nums = 5.5, nums2;
        nums2 = 6.35265; // инициализируем переменную
        final double pi = 3.1415926535;  //создание константы, которую нельзя изменить
        byte i1 = -120;
        int i;
        i1 += 1;
        i = (int) nums2; // приведение к одному типу данных
        char ch = 's';
        String str = "line";


        System.out.println(i + B + nums + str + pi + i1 + b + isTrue + a + variables + isFalse); // вывод данных с переходом на новую строку
        System.out.print(nums2); // вывод данных без перехода на следующую строку
        System.out.println(' ');
        System.out.printf("i = %d, half = %f, nums2 = %.5f", i, half, nums2); // форматированный вывод данных
        System.out.print("\nHello \nworld ");
        System.out.println(' ');
        System.out.println("i = " + i + ", ch = " + ch);
        /*
        System.out.printf(<шаблон формата>, [список аргументов]);
        System.out.printf("i = %d, half = %f, nums = %.3", i, half, nums);
         % - спецификатор
         %d - вывод целочисленных значений
         %f - вещественных
         %.2f - вещественных с точностью до сотых (где 2 - количество знаков после запятой)
         %.nf - вещественных с точностью до n-го знака после запятой
         %c - для отдельного символа типа char
         %s - для строк
         %% - вывод процентов
         */
        /*
        Ввод данных System.in или класс Scanner (исп. пакет java.util)
        Чтобы каждый раз не писать имя пакета при создании нового класса, можно импортировать пакет перед классом Main
        import java.util.*; - импортировать все классы в пакете, нужно использовать осторожно, чтобы не было конфликта имен
        import java.util.Scanner; - импортировать конкретный класс Scanner
         */
        // java.util.Scanner in = new java.util.Scanner(System.in); //создаем новый объект класса Scanner
        Scanner inner = new Scanner(in);
        System.out.print("Input number: ");
        int num = inner.nextInt();

        System.out.printf("Your number: %d\n", num);

        //inner.close(); // закрываем поток, который открыли
        /*
            next() - считывает введенную строку до первого пробела
            nextLine() - считывает введенную строку до перевода строки
            nextByte() - считывает введенное число как byte
            nextShort() - считывает введенное число как short
            nextInt() - считывает введенное число как тип int
            nextDouble() - считывает введенное число как double
            nextFloat() - считывает введенное число как float
            nextBoolean() - считывает значение boolean
         */
        Scanner go = new Scanner(in);
        System.out.print("Input name: ");
        String name = go.nextLine();
        System.out.print("Input age: ");
        int age = go.nextInt();
        System.out.print("Input height: ");
        float height = go.nextFloat(); // принимает на вход число float c запятой
        System.out.printf("Name: %s Age: %d Height: %.2f \n", name, age, height);

        /*
        in.close();  полностью закрываем поток
        go.close(); Закрывает этот поток и освобождает все системные ресурсы, связанные с ним
        */
        int n1 = 5, n2 = 7;
        int res1 = n1 + n2;
        short math1 = (short) (res1 + 5 + n1 + 7);
        System.out.println("Result is: " + math1);

        double n3, n4;
        Scanner numbers = new Scanner(System.in);
        System.out.print("Input n3 = ");
        n3 = numbers.nextDouble();
        System.out.print("Input n4 = ");
        n4 = numbers.nextDouble();

        double n5 = 2 * (n3 + n4);
        System.out.println(n5);

        int n6 = 7;
        int n7 = 2;
        double n8 = n6 / (double) n7;
        float n9 = 7.0f / 2;
        int ost = 10 % 3;
        short var = 0;
        var++; // операция инкремента, можно записать так: ++var
        float arg = 5;
        arg--;

        System.out.println(var + arg);
        System.out.println("Result n9 is: " + n9 + ". Result n8 is: " + n8 + ". Result ost is: " + ost);
        int num1, num2, num3 = 10, num4 = 10;
        num1 = num3++; // сначала num1 присваивается значение num3 и только потом увеличивается на 1
        num2 = ++num4; // num2 присваивается значение num4, увеличенное на 1
        System.out.println("a = " + num1 + ", b = " + num2 + ", c = " + num3 + ", d = " + num4);

    }
}
