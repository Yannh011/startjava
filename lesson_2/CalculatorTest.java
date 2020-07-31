import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		calc.getSign() = scan.next().charAt(0);
		calc.calc(num1, num2, sign);// Я ПОЛУЧАЕТСЯ ТАК ВЫЗЫВАЮ МЕТОД? В классах Wolf и WolfTest мы так делали.
		int result = calc(num1, num2, sign);
		System.out.println(result);
	}
}