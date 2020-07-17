public class Calculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		char sign = '^';
		
		if (sign == '-') {
			System.out.println(a - b);
		} else if (sign == '/') {
			System.out.println(a / b);
		} else if (sign == '+') {
			System.out.println(a + b);
		} else if (sign == '*') {
			System.out.println(a * b);
		} else if (sign == '%') {
			System.out.println(a % b);
		} else if (sign == '^') {
			int degree = 1;
			int result = 1;
			while (degree <= 2) {
				result *= a;
				degree++;
			}
			System.out.println(result);
		}
	}
}
