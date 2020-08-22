package com.startjava.lesson_2_3_4.robot;

public class Jaeger {

	private String modelName;
	private float height;
	private float weight;
	private int kaijuKilled;

	public Jaeger(String modelName, float height, float weight, int kaijuKilled) {
		this.modelName = modelName;
		this.height = height;
		this.weight = weight;
		this.kaijuKilled = kaijuKilled; 
	}

	public String getModelName() {
		return modelName;
	}

	void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public float getHeight() {
		return height;
	}

	void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	void setWeight(float weight) {
		this.weight = weight;
	}

	public int getKaijuKilled() {
		return kaijuKilled;
	}

	void setKaijuKilled(int kaijuKilled) {
		this.kaijuKilled = kaijuKilled;
	}

	public String toString() {
		return modelName + " " + height + " " + weight + " " + kaijuKilled;
	}
}