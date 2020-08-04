import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		char answer = 'Y';
		while (answer != 'N') {
			if (answer == 'Y') {
			System.out.print("Введите первое число: ");
			calc.setNum1(scan.nextInt());
			System.out.print("Введите знак математической операции: ");
			calc.setSign(scan.next().charAt(0));
			System.out.print("Введите второе число: ");
			calc.setNum2(scan.nextInt());
			System.out.println(calc.calculate());
			} 
			System.out.println("Хотите продолжить?[Y/N]:");
			answer = scan.next().charAt(0);
			if (answer != 'Y' && answer !='N') {
				System.out.println("Хотите продолжить?[Y/N]:");
			} else if (answer == 'N') {
				System.out.println("Спасибо!");
			}
		}
	}
}