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
		player1.setAttempt(0);
		player2.setAttempt(0);
		numberQuiz = (int) (Math.random() * 101);
		//do {
		//	player1.setNumbers(scan.nextInt());
		//	System.out.println("Я думаю это число: " + player1.getNumbers()[player1.getAttempt()]);
		//	player1.setAttempt(player1.getAttempt() + 1);
		//	if (player1.getNumbers()[player1.getAttempt()-1] < numberQuiz) {
		//		System.out.println("Загаданное число больше " + player1.getName());
		//	} else if (player1.getNumbers()[player1.getAttempt()-1] > numberQuiz) {
		//		System.out.println("Загаданное число меньше " + player1.getName());
		//	} else if (player1.getNumbers()[player1.getAttempt()-1] == numberQuiz) {
		//		System.out.println("Игрок " + player1.getName() + " угадал число " + numberQuiz + " с " + player1.getAttempt());
		//		break;
		//	}
//
		//	player2.setNumbers(scan.nextInt());
		//	System.out.println("Я думаю это число: " + player2.getNumbers()[player2.getAttempt()]);
		//	player2.setAttempt(player2.getAttempt() + 1);
		//	if (player2.getNumbers()[player2.getAttempt()-1] < numberQuiz) {
		//		System.out.println("Загаданное число больше " + player2.getName());
		//	} else if (player2.getNumbers()[player2.getAttempt()-1] > numberQuiz) {
		//		System.out.println("Загаданное число меньше " + player2.getName());
		//	} else if (player2.getNumbers()[player2.getAttempt()-1] == numberQuiz) {
		//		System.out.println("Игрок " + player2.getName() + " угадал число " + numberQuiz + " с " + player2.getAttempt() + " попытки!");
		//		break;
		//	}
		do {
			chooseNumber(player1);
			if (compNumberQuiz(player1)) {
				break;
			}
			chooseNumber(player2);
			if (compNumberQuiz(player2)) {
				break;
			}

			if (player1.getAttempt() > 9) {
				System.out.print("Закончились попытки");
				break;
			}

			if (player2.getAttempt() > 9) {
				System.out.print("Закончились попытки");
				break;
			}
		} while (true);
		showNumbers(player1);
		showNumbers(player2);
		Arrays.fill(player1.getNumber(), 0, player1.getAttempt(), 0);
		Arrays.fill(player2.getNumber(), 0, player2.getAttempt(), 0);
	}

	private void chooseNumber(Player player) {
		player.setNumber(scan.nextInt());
		System.out.println("Я думаю это число: " + player.getNumber()[player.getAttempt()]);
		player.setAttempt(player.getAttempt() + 1); }

	private boolean compNumberQuiz(Player player) {
		if (player.getNumber()[player.getAttempt() - 1] < numberQuiz) {
			System.out.println("Загаданное число больше " + player.getName());
		} else if (player.getNumber()[player.getAttempt() - 1] > numberQuiz) {
			System.out.println("Загаданное число меньше " + player.getName());
		} else if (player.getNumber()[player.getAttempt() - 1] == numberQuiz) {
			System.out.println("Игрок " + player.getName() + " угадал число " + numberQuiz + " с " + player.getAttempt());
			return true;
		}
		return false;
	}

	private void showNumbers(Player player) {
		System.out.print("Введенные игроком " + player.getName() + " числа:");
		//int[] numbers = Arrays.copyOf(player.getNumber(), player.getAttempt());
		for (int number : player.getNumber()) {
			System.out.print(number + " ");
		}
	}
}