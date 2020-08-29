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
		//player1.setAttempt(0);
		//player2.setAttempt(0);
		numberQuiz = (int) (Math.random() * 101);
		makeMove(player1);
		makeMove(player2);
		showNumbers(player1);
		showNumbers(player2);
		Arrays.fill(player1.getNumbers(), 0, player1.getAttempt(), 0);
		Arrays.fill(player2.getNumbers(), 0, player2.getAttempt(), 0);
	}

	private void inputNumber(Player player) {
		player.setNumber(scan.nextInt());
		System.out.println("Я думаю это число: " + player.getLastNumber());
	}

	private boolean compareNumber(Player player) {
		if (player.getLastNumber() == numberQuiz) {
			System.out.println("Игрок " + player.getName() + " угадал число " + numberQuiz + " с " + player.getAttempt());
			return true;
		} else {
			String compareNumber = player.getLastNumber() < numberQuiz ? "меньше" : "больше";
			System.out.println("Загаданное число " + compareNumber);
			return false;
		}
	}

	private void makeMove(Player player) {
		do {
				inputNumber(player);
				if (compareNumber(player)) {
					break;
				}

				if (player.getAttempt() > 9) {
					System.out.print("Закончились попытки");
					break;
				}
			}
			while (true) ;
		}

	private void showNumbers(Player player) {
		System.out.print("Введенные игроком " + player.getName() + " числа:");
		for (int number : player.getNumbers()) {
			System.out.print(number + " ");
		}
	}
}