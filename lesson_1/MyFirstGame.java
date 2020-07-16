public class MyFirstGame {
	public static void main(String[] args) {
		int number = 40;
		int playerNumber = 45;
		System.out.println("Угадай число от 0 до 100.");
		while (true) {
			if (playerNumber == number) {
			System.out.println("Вы угадали!");
			} else if (playerNumber > number) {
				System.out.println("Введенное вами число больше того, что загадал компьютер.");
			} else if (playerNumber < number) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер.");}
		break;
		}
	}
}
