package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {

	Scanner scan = new Scanner(System.in);
	private Player player1;
	private Player player2;
	private int numberQuiz;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		numberQuiz = (int) (Math.random() * 101);
		for (int i = 0; i <= 10; i++) {
			if (makeMove(player1)) {
				break;
			}
			if (makeMove(player2)) {
				break;
			}
		}
		showNumbers(player1);
		showNumbers(player2);
		player1.fillNumbers();
		player2.fillNumbers();
	}

	private boolean makeMove(Player player) {
		if (player.getAttempt() > 9) {
			System.out.println("Закончились попытки " + player.getName());
		return false;
		}
		inputNumber(player);
		return compareNumber(player);
	}

	private void inputNumber(Player player) {
		System.out.println(player.getName() + " назовите число.");
		player.setNumber(scan.nextInt());
		System.out.println("Я думаю это число: " + player.getLastNumber());
	}

	private boolean compareNumber(Player player) {
		if (player.getLastNumber() == numberQuiz) {
			System.out.println("Игрок " + player.getName() + " угадал число " + numberQuiz + " с " + player.getAttempt());
			return true;
		}
			String compareNumber = player.getLastNumber() < numberQuiz ? "больше" : "меньше";
			System.out.println("Загаданное число " + compareNumber);
			return false;
	}

	private void showNumbers(Player player) {
		System.out.print(player.getName() + " ");
		for (int number : player.getNumbers()) {
			System.out.print(number + " ");
		}
	}
}
