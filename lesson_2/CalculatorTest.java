public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Введите первое число: " + calc.getNum1());
		System.out.println("Введите знак матемаческой операции: " + calc.getSign());
		System.out.println("Введите второе число: " + calc.getNum2());
		calc.calculate();// я завис, здесь мы должны передать метод из Calculator...
		System.out.println(result);
	}
}