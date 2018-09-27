package com.assessment;

abstract class Bird extends Animal implements CanSing {
	void fly() {
		System.out.println("I am flying");
	}
}
