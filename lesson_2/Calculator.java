public class Calculator {

	private int num1;
	private int num2;
	private char sign;

	public int getNum1() {
		return num1;
	}
	void setA(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	void setB (int num2) {
		this.num2 = num2;
	}
	public char getSign() {
		return sign;
	}
	void setSign(char sign) {
		this.sign = sign;
	}

	public static int calc(int num1, int num2, char sign) {
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
	return result;
	}
}
