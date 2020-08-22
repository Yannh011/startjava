package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char answer = 'Y';
		while (answer != 'N') {
			if (answer == 'Y') {
				System.out.println("Представьте первого игрока");
				Player player1 = new Player(scan.next());
				System.out.println("Представьте второго игрока");
				Player player2 = new Player(scan.next());
				GuessNumber game = new GuessNumber(player1, player2);
				System.out.println("Начнем игру!");
				game.startGame();
			}
			System.out.println("Хотите продолжить?[Y/N]:");
			answer = scan.next().charAt(0);
			if (answer != 'Y' && answer !='N') {
				System.out.println("Вы ввели неправильный символ");
			} 
		}
		System.out.println("Конец игры");
	}
}