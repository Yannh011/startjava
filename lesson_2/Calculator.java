public class Calculator {

	int a;
	int b;
	char sign;
	int result;

	switch (sign) {
		case '+':
		result = a + b;
		break;

		case '/':
		result = a / b;
		break;

		case '+':
		result = a + b;
		break;

		case '*':
		result = a * b;
		break;

		case '%':
		result = a % b;
		break;

		case '^':
			int result1 = 1;
			for (int i = 0; i < b; i++) {
			result1 *= a;
			}
			System.out.println(result1);
			break;
	}
}
