package ru.sdobnikov.lab_1;

public class MyClass {
    public static int max(int ... vals) {
        int max = vals[0];
        for (int i : vals) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public static int min(int ... vals) {
        int min = vals[0];
        for (int i : vals) {
            if (i < min)
                min = i;
        }
        return min;
    }
}
