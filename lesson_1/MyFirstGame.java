public class MyFirstGame {
	public static void main(String[] args) {
		int a = 40;
		System.out.println("Угадай число от 0 до 100.");
		while (true) {
			if (a == 40) {
				System.out.println("Вы угадали!");
			}
			else if (a > 40) {
				System.out.println("Введенное вами число больше того, что загадал компьютер.");
			}
			else  if (a < 40) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер.");
			} 
			break;
		}
	}
}
