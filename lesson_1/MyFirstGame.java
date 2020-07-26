public class MyFirstGame {
	public static void main(String[] args) {
		int numberQuiz = 40;
		int playerNumber = 45;
		System.out.println("Угадай число от 0 до 100.");
		while (playerNumber != numberQuiz) {
			if (playerNumber > numberQuiz) {
				System.out.println("Введенное вами число " + playerNumber + " больше того, что загадал компьютер.");
				playerNumber--;
			} else if (playerNumber < numberQuiz) {
				System.out.println("Введенное вами число " + playerNumber + " меньше того, что загадал компьютер.");
				playerNumber++;
			}
		}
		System.out.println("Вы угадали!");
	}
}
