package org.example.sample;

import org.example.regular.Calculator;
import org.example.regular.Formatter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        double result = Calculator.add(a, b);
        Formatter.printResult("Сумма:", a, b, result);

        result = Calculator.subtract(a, b);
        Formatter.printResult("Разница:", a, b, result);

        result = Calculator.multiply(a, b);
        Formatter.printResult("Произведение:", a, b, result);

        try {
            result = Calculator.divide(a, b);
            Formatter.printResult("Деление:", a, b, result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}