package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int[] number = new int[10];
	private int attempt;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int[] getNumber() {
		return Arrays.copyOf(number, attempt + 1);
	}

	public void setNumber(int number) {
		this.number[attempt] = number;
	}

	public int getAttempt() {
		return attempt;
	}

	public void setAttempt(int attempt) {
		this.attempt = attempt++;
	}
}