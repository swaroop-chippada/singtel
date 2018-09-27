package com.assessment;

public class Solution {
	public static void main(String[] args) {
		SingingBird someBird = new SingingBird() {

			@Override
			public void sing() {
				// TODO Auto-generated method stub
				System.out.println("some Bird");
			}
		};
		someBird.fly();
		someBird.sing();
		someBird.walk();
		
		
		SingingBird duck = new SingingBird() {

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
		
		
		
		SingingBird parrot1 = new SingingBird() {

			@Override
			public void sing() {
				// TODO Auto-generated method stub
				System.out.println("Woof, woof");
			}
		};
		parrot1.fly();
		parrot1.sing();
		parrot1.walk();

		SingingBird parrot2 = new SingingBird() {

			@Override
			public void sing() {
				// TODO Auto-generated method stub
				System.out.println("Meow");
			}
		};
		parrot2.fly();
		parrot2.sing();
		parrot2.walk();

		SingingBird parrot3 = new SingingBird() {

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
