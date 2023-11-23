package org.example.regular;

public class Formatter {
    public static void printResult(String operation, double a, double b, double result) {
        System.out.printf("%s %.2f and %.2f = %.2f\n", operation, a, b, result);
    }
}
