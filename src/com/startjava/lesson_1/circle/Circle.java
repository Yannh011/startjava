package com.startjava.lesson_1.circle;

public class Circle {
	public static void main(String[] args) {
		for (int i = 0; i < 21; i++) {
			System.out.println(i);
		}
		
		int counter = -6;
		while (counter <= 6) {
			System.out.println(counter);
			counter += 2;
		}
		
		int b = 13;
		int result = 11;
		do {
			result += b;
			System.out.println(result);
			b += 2;
		} while (b <= 20);
	}
}
