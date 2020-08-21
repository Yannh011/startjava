package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		char answer = 'Y';
		while (answer != 'N') {
			if (answer == 'Y') {
				System.out.print("Введите математическое выражение: ");
				String [] expression = scan.next().split("");
				calc.setNum1(Integer.parseInt(expression[0]));
				calc.setSign(expression[1].charAt(0));
				calc.setNum2(Integer.parseInt(expression[2]));
				System.out.println (calc.calculate());
			} 
			System.out.println("Хотите продолжить?[Y/N]:");
			answer = scan.next().charAt(0);
			if (answer != 'Y' && answer !='N') {
				System.out.println("Вы ввели неправильный символ");
			} 
		}
		System.out.println("Конец игры");
	}
}