package com.startjava.lesson_1.conditional_statement;

public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 27;
		if (age > 20) {
			System.out.println("Ты старше, чем он.");
		}

		String man = "man";
		if (man == man) {
			System.out.println("Ты мужчина.");
		}
		
		if (man != man) {
			System.out.println("Ты не мужчина.");
		}

		int height = 170;
		if (height < 180) {
			System.out.println("Ты маленький.");
		} else {
			System.out.println("Ты высокий.");
		}

		String firstNameLetter = "Y";
		if (firstNameLetter == "M") {
			System.out.println("Неправильное начало имени.");
		} else if (firstNameLetter == "K") {
			System.out.println("Снова неправильное начало имени.");
		} else {
			System.out.println("Правильное начало имени.");
		}
	}
}
