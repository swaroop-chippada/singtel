package com.assessment;

import com.test.Mammal;

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
		
		
		Bird duck = new Bird() {

			@Override
			public void sing() {
				// TODO Auto-generated method stub
				System.out.println("�Quack, quack");
			}
		};
		duck.fly();
		duck.sing();
		duck.walk();

		Mammal chicken = new Mammal() {

			@Override
			public void sing() {
				// TODO Auto-generated method stub
				System.out.println("Cluck, cluck");
			}
		};
		chicken.sing();
		chicken.walk();
		
		
		Mammal rooster = new Mammal() {

			@Override
			public void sing() {
				// TODO Auto-generated method stub
				System.out.println("Cock-a-doodle-doo�");
			}
		};
		
		rooster.setMale(true);

		rooster.sing();
		rooster.walk();
	}
}
