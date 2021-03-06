package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

	private int num1;
	private int num2;
	private char sign;

	public int getNum1() {
		return num1;
	}

	void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	void setNum2(int num2) {
		this.num2 = num2;
	}

	public char getSign() {
		return sign;
	}

	void setSign(char sign) {
		this.sign = sign;
	}

	public int calculate() {
		int result = 0;
		switch (sign) {
			case '+':
				result = Math.addExact(num1, num2);
				break;
			case '/':
				result = Math.floorDiv(num1, num2);
				break;
			case '-':
				result = Math.subtractExact(num1, num2);
				break;
			case '*':
				result = Math.multiplyExact(num1, num2);
				break;
			case '%':
				result = num1 % num2;
				break;
			case '^':
				result = (int) Math.pow(num1, num2);
		}
		return result;
	}
}
