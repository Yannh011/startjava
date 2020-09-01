package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int[] numbers = new int[10];
	private int attempt = -1;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int[] getNumbers() {
		return Arrays.copyOf(numbers, attempt);
	}

	public void setNumber(int number) {
		attempt++;
		numbers[attempt] = number;
	}

	public int getLastNumber() {
		return numbers[attempt];
	}

	public int getAttempt() {
		return attempt;
	}
}