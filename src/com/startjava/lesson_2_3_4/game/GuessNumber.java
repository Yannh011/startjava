package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
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
		do {
			if (makeMove(player1)) {
				break;
			}
			if (makeMove(player2)) {
				break;
			}
		} while (player1.getAttempt() <= 9 || player2.getAttempt() <= 9);
		showNumbers(player1);
		showNumbers(player2);
		Arrays.fill(player1.getNumbers(), 0, player1.getAttempt(), 0);
		Arrays.fill(player2.getNumbers(), 0, player2.getAttempt(), 0);
	}

	private boolean makeMove(Player player) {
		if (player.getAttempt() > 9) {
			System.out.print("Закончились попытки");
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
		} else {
			String compareNumber = player.getLastNumber() < numberQuiz ? "больше" : "меньше";
			System.out.println("Загаданное число " + compareNumber);
			return false;
		}
	}

	private void showNumbers(Player player) {
		System.out.print("Введенные игроком " + player.getName() + " числа:");
		int[] copyNumbers = Arrays.copyOf(player.getNumbers(), player.getAttempt());
		for (int i = 0; i < copyNumbers.length; i++) {
			System.out.print(copyNumbers[i] + " ");
		}
	}
}