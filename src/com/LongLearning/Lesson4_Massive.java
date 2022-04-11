package com.LongLearning;

public class Lesson4_Massive {
    public static void main(String[] args) {
        // <тип данных><имя массива>[]; - этот вариант не нравится IDEA или <тип данных>[]<имя массива>;
        float[] array = new float[100]; // указываем кол-во элементов в массиве
        float k = 0.5f, b = 2.0f;


        for (int x = 0; x < 100; ++x)
            array[x] = k * x + b;


        for (int x = 0; x < 100; ++x)
            System.out.print(array[x] + " ");

        System.out.println(" "); // empty line

        float a = array[5]; // в переменную кладем значение 5 элемента списка
        System.out.println(a);

        int[] powers = {1, 2, 4, 6};

        for (int x = 0; x < powers.length; ++x) {
            System.out.print(powers[x] + " "); // выводим список
        }

        System.out.println(" "); // empty line

        System.out.println(powers[powers.length - 1]); // выводим длину списка

        int[][] array2D = new int[3][4]; // двумерный массив (строка и столбец на выбор)
        array2D[0][0] = 1; // в первый элемент записано число 1
        array2D[1][0] = 3;
        for (int p = 0; p < array2D.length; ++p) { // for (int[] ints : array2D)
            for (int m = 0; m < array2D.length; ++m)
                System.out.print(array2D[p][m] + " ");
            System.out.print("\n");
        }

        System.out.println(" "); // empty line

        final int N = 10;
        int[][] E = new int[N][N];

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (i == j) {
                    E[i][j] = 1;
                } else {
                    E[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                System.out.print(E[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println(" "); // empty line

        // многомерные зубчатые массивы

        short[][] z = new short[5][]; // где [5] - длина строки массива

        z[0] = new short[3]; // длина первого столбца массива
        z[1] = new short[4]; // длина второго столбца массива
        z[2] = new short[2];
        z[3] = new short[3];
        z[4] = new short[1];

        short count = 1;
        for (int i = 0; i < z.length; ++i) {
            for (int j = 0; j < z[i].length; ++j) {
                z[i][j] = count;
                count++;
            }
        }
        for (int i = 0; i < z.length; ++i) {
            for (short val : z[i]) {  // for (<тип данных> : <коллекция>) {тело цикла}
                System.out.print(val + " ");
            }
            System.out.print("\n");
        }
        //  1. Удаление значения из массива по индексу

        final int L = 9;
        short[] g = new short[L];

        for (int i = 0; i < L; ++i) {
            g[i] = (short) (i + 1);
        }
        for (int i = 5; i < L - 1; ++i) { // счетчик идет от 5 до предпоследнего элемента массива (7)
            g[i] = g[i + 1]; // присваиваем значение следующего элемента
        }

        for (short val : g) {
            System.out.print(val + " ");
        } // было 1 2 3 4 5 6 7 8 9 : стало 1 2 3 4 5 7 8 9 9

        System.out.print("\n"); // empty line
        // 2. Вставка значения в массив по индексу
        // сначала нужно сместить список с последнего элемента
        // затем, нужно вставить элемент

        short[] s = new short[]{1, 2, 3, 5, 6, 7, 8, 9, 9};

        for (int i = 8; i > 3; --i) {
            s[i] = s[i - 1];
        }
        s[3] = 4;

        for (short val : s) {
            System.out.print(val + " ");
        }
        System.out.print("\n");
        // было 1 2 3 5 6 7 8 9 9 : стало 1 2 3 4 5 6 7 8 9

        // 3. Сортировка элементов массива по методу всплывающего пузырька
        // находим в массиве мин. число и меняем местами элементы, где мин. перемещается на место первого элемента
        // 3 5 1 6 2 4
        byte[] mas = {3, 5, 1, 6, 2, 4};

        for (int i = 0; i < mas.length - 1; ++i) {
            byte min = mas[i]; // хранит мин. значение элемента
            int pos = i; // индекс мини. элемента

            // вложенный цикл находит мин. элемент среди оставшихся, сравнивая с текущим
            for (int j = i + 1; j < mas.length; ++j) {
                if (min > mas[j]) {
                    pos = j;
                    min = mas[j];
                }
            }
            // производим обмен
            byte change = mas[i];
            mas[i] = mas[pos];
            mas[pos] = change;
        }
        for (short val : mas) {
            System.out.print(val + " ");
        }
        // было 3 5 1 6 2 4 : стало 1 2 3 4 5 6

    }
}