package com.startjava.lesson_2_3_4.wolf;

public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setSex("women");
		wolfOne.setName("Серый");
		wolfOne.setWeight(150);
		wolfOne.setAge(20);
		wolfOne.setColor("Green");
		System.out.println("sex = " + wolfOne.getSex());
		System.out.println("name = " + wolfOne.getName());
		System.out.println("weight = " + wolfOne.getWeight());
		System.out.println("age = " + wolfOne.getAge());
		System.out.println("color = " + wolfOne.getColor());

		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}