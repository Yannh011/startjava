package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        char answer = 'Y';
        while (answer != 'N') {
            if (answer == 'Y') {
                System.out.print("Введите математическое выражение: ");
                String[] expression = sc.next().split("");
                calc.setNum1(Integer.parseInt(expression[0]));
                calc.setNum2(Integer.parseInt(expression[2]));
                calc.setSign(expression[1].charAt(0));

                System.out.println(calc.calculate());
            }
            System.out.println("Do you want to continue? [Y/N]:");
            answer = sc.next().charAt(0);
            if (answer != 'N' && answer != 'Y') {
                System.out.println("Wrong answer! Try again!");
            }
        }
    }
}