public class Calculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int sum = a + b;
		int sub = a - b;
		int mult = a * b;
		int div = a / b;
		int mod = a % b;
		int square;
		int result = 100;
		if (sub == result) {
			System.out.println(a - b);
		} else if (div == result) {
			System.out.println(a / b);
		} else if (sum == result) {
			System.out.println(a + b);
		} else if (mult == result) {
			System.out.println(a * b);
		} else if (mod == result) {
			System.out.println(a % b);
		} else if (square == result) {
			int power = 2;
			while (power ==2) {
			a = a * power;
			System.out.println(a);}
		}
	}
}
