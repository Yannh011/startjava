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
			int result = 1;
			while (b <= 9) {
				result *= a;
				b++;
			}
			System.out.println(result);
		}
	}
}
