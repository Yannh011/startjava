public class Calculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int result = 100;
		if (a - b == result) {
			System.out.println(a - b);
		} else if (a / b == result) {
			System.out.println(a / b);
		} else if (a + b == result) {
			System.out.println(a + b);
		} else if (a * b == result) {
			System.out.println(a * b);
		} else if (a % b == result) {
			System.out.println(a % b);
		} else if (a < result) {
			int degree = 1;
			int power = 1;
			while (true) {
			power = power * a;
			System.out.println(power);
			degree ++;
			if (degree > 2)
			break;}
		}
	}
}
