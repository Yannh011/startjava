import java.util.Scanner;

public class Calculator {

Scanner scan = new Scanner(System.in);
	private int num1 = scan.nextInt();
	private int num2 = scan.nextInt();
	private char sign = scan.next().charAt(0);

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

	public static int calculate(int num1, int num2, char sign) {
		int result;
		switch (sign) {
			case '+':
				result = num1 + num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			case '^':
				int result1 = 1;
				for (int i = 0; i < num2; i++) {
					result1 *= num1;
				}
				System.out.println(result1);
				break;
		}
		return result;// не понимаю как её проинициализировать...
	}
}
