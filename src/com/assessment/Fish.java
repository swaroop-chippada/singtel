package com.assessment;

abstract class Fish {
	
	private String size;
	private String color;
	private boolean doesCrackJokes;
	private boolean doesEatOtherFish;

	void swim() {
		System.out.println("i can swim");
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isDoesCrackJokes() {
		return doesCrackJokes;
	}

	public void setDoesCrackJokes(boolean doesCrackJokes) {
		this.doesCrackJokes = doesCrackJokes;
	}

	public boolean isDoesEatOtherFish() {
		return doesEatOtherFish;
	}

	public void setDoesEatOtherFish(boolean doesEatOtherFish) {
		this.doesEatOtherFish = doesEatOtherFish;
	}

}
