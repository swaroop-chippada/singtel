package com.assessment;

abstract class Mammal extends Animal implements CanSing {
	
	private boolean isMale;

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
}
