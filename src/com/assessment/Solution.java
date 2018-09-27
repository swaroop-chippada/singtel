package com.assessment;

import com.test.Bird;
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
				System.out.println("“Quack, quack");
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
				System.out.println("Cock-a-doodle-doo”");
			}
		};
		
		rooster.setMale(true);

		rooster.sing();
		rooster.walk();
		
		
		
		Bird parrot1 = new Bird() {

			@Override
			public void sing() {
				// TODO Auto-generated method stub
				System.out.println("Woof, woof");
			}
		};
		parrot1.fly();
		parrot1.sing();
		parrot1.walk();

		Bird parrot2 = new Bird() {

			@Override
			public void sing() {
				// TODO Auto-generated method stub
				System.out.println("Meow");
			}
		};
		parrot2.fly();
		parrot2.sing();
		parrot2.walk();

		Bird parrot3 = new Bird() {

			@Override
			public void sing() {
				// TODO Auto-generated method stub
				System.out.println("Cock-a-doodle-doo");
			}
		};
		
		parrot3.fly();
		parrot3.sing();
		parrot3.walk();

	}
}
