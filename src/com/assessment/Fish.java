package com.assessment;

public class Fish extends SwimmingFish {

	private String size;
	private String color;
	private boolean doesCrackJokes;
	private boolean doesEatOtherFish;

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
