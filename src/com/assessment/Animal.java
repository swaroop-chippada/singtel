package com.assessment;

class Animal implements LivingThings{
	
	private boolean isTransformable;
	
	void walk() {
		System.out.println("I am walking");
	}

	public boolean isTransformable() {
		return isTransformable;
	}

	public void setTransformable(boolean isTransformable) {
		this.isTransformable = isTransformable;
	}
}