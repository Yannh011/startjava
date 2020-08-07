import java.util.Scanner;

public class GuessNumber {

	Scanner scan = new Scanner(System.in);
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
		int numberQuiz = (int) (Math.random() * 101);
		do { 
			player1.setNumber(scan.nextInt());
			if (player1.getNumber() < numberQuiz) {
				System.out.println("Загаданное число больше");
			} else if (player1.getNumber() > numberQuiz) {
				System.out.println("Загаданное число меньше");
			} else if (player1.getNumber() == numberQuiz) {
				System.out.println("Victory" + player1.getName());
				break;
			}

			player2.setNumber(scan.nextInt());
			if (player2.getNumber() < numberQuiz) {
				System.out.println("Загаданное число больше");
			} else if (player2.getNumber() > numberQuiz) {
				System.out.println("Загаданное число меньше");
			} else if (player2.getNumber() == numberQuiz) {
				System.out.println("Victory" + player2.getName());
				break;
			}
		} while (true);
	}
}