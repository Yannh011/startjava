package com.startjava.lesson_2_3_4.wolf;

public class Wolf {

	private String sex = "man";
	private String name = "Волчок";
	private int weight = 200;
	private int age = 8;
	private String color = "Grey";

	public String getSex() {
		return sex;
	}

	void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}
	
	void setColor(String color) {
		this.color = color;
	}

	public void go() {
		System.out.println("Вперед");
	}

	public void sit() {
		System.out.println("Сидеть");
	}

	public void run() {
		System.out.println("Бежать");
	}

	public void howl() {
		System.out.println("Выть");
	}

	public void hunt() {
		System.out.println("Охотиться на зайца");
	}
}