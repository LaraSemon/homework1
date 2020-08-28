package ru.geekbrains.lesson_1.homework1;

public class Task3 {
    public static void main(String[] args) {
        double result =  evaluateExpression (2, 1,  2,  3);
        System.out.println(result);

    }

    private static double evaluateExpression(int a, int b, int c, int d) {
        if (d==0) throw new RuntimeException("Нельзя делить на ноль!");
        return a * (b + (c / d));
    }


    static void testTern (int a) { }
}
