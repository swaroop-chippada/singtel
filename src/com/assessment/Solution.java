package com.assessment;

public class Solution {
	public static void main(String[] args) {
		Bird someBird = new Bird() {

			@Override
			public void sing() {
				// TODO Auto-generated method stub
				System.out.println("some Bird");
			}
		};
		someBird.fly();
		someBird.sing();
		someBird.walk();
	}
}
