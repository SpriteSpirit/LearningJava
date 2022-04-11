package com.LongLearning;

import java.util.Scanner;

public class Lesson3_While_for_dowhile {
    public static void main(String[] args) {
        int S = 0;
        int n = 1;

        Scanner in = new Scanner(System.in);

        while (S < 100 && n != 0) {
            System.out.print("Input S: ");
            S = in.nextInt();
            S += n;

        }
        System.out.println("S is: " + S);
        ///

        int k = 0;
        int b = 1;

        while ((k += ++b) < 50); // (к переменной k прибавляем инкремент) (пока она) меньше 50
            System.out.println(k);

        ///

        int g = 54;

        for (int i = 1; i <= 1000; ++i) { // <инициализация счетчика>;<условие>;<изменение значения счетчика>
            g += 1;
        }
        System.out.println(g);

        double D = 0;

        for (int j = 1; j <= 100; ++j) D += 1.0 / j;
        System.out.println(D);

        double f, l, w;
        Scanner in2 = new Scanner(System.in);
        System.out.println("Input l and w: ");
        l = in2.nextDouble();
        w = in2.nextDouble();

        double x = 0;
        for (;;) {
            if (x > 1) break;
            f = l * x *  w;
            System.out.print(f + " ");
            x += 0.1;
        }

        System.out.println(" ");

        final int secret_code = 13;
        int code_enter;
        Scanner in3 = new Scanner(System.in);

        do {            // сначала выполняет тело цикла, потом проверяет условие
            System.out.print("Input the secret code: ");
            code_enter = in3.nextInt();
            if (code_enter != secret_code) System.out.println("The secret code is wrong!");

        }
        while (code_enter != secret_code);
        System.out.println("The secret code accepted!");

        // считаем сумму 5 введенных положительных чисел
        float c, H = 0;
        int v = 0;

        Scanner in4 = new Scanner(System.in);

        do {
            System.out.println("Input number: ");
            c = in4.nextInt();

            if (c < 0) continue; // если число окажется отрицательным, то, все что идет ниже - будет пропущено циклом

            v++;
            H += c;
            System.out.println("The sum is: " + H);
        } while (v < 5);




    }
}
