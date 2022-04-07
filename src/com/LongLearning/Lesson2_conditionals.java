package com.LongLearning;

import java.util.Scanner;

public class Lesson2_conditionals {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = in.nextInt();
        if (num < 0) {
            System.out.println("The number is negative");
        } else if (num > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is 0");
        }
        System.out.println(num);

        short item = -1;
        Scanner in2 = new Scanner(System.in);
        System.out.println("1 - square of the triangle\n2 - square of the rectangle");
        item = in.nextShort();

        double h, a, S = 0;
        if (item == 1) {
            System.out.println("Input height and base of the triangle");
            h = in.nextDouble();
            a = in.nextDouble();
            S = 0.5 * h * a;
        } else if (item == 2) {
            System.out.println("Input sides of the rectangle");
            h = in.nextDouble();
            a = in.nextDouble();
            S = h * a;
        }
        System.out.println("The square equals: " + S);
        
        double k;
        Scanner in3 = new Scanner(System.in);
        System.out.println("Input number for check: ");
        k = in3.nextDouble();

        if (k >= -2 && k <= 5) {
            System.out.println("The number belongs to [-2; 5]");
        } else if (k >= -2 || k <= 5) {
            System.out.println("The number doesn't belongs to [-2; 5]");
        }

        boolean isTrue;
        Scanner in4 = new Scanner(System.in);
        System.out.println("Input true or false ");
        isTrue = in4.nextBoolean();

        if (isTrue) System.out.println("Is true");
        if (!isTrue) System.out.println("Is false");

        int x = -1, y = 5;
        if ((x < 0 || x > 2) && y >= 5 && y <= 7) {
            System.out.println("The x doesn't belong [0; 2], y belongs [5; 7]");
        }

        short choose;
        System.out.println("0 - exit\n1 - square of the triangle\n2 - square of the rectangle\n3 - square of the circle\n4 - square of the trapezoid ");
        Scanner in5 = new Scanner(System.in);
        choose = in5.nextShort();

        switch (choose) {
            case 1 -> System.out.println("You choose square of the triangle");
            case 2 -> System.out.println("You choose square of the rectangle");
            case 3 -> System.out.println("You choose square of the circle");
            case 4 -> System.out.println("You choose square of the trapezoid");
            default -> System.out.println("You don't choose anything");
        }
        //in.close();
    }
}
