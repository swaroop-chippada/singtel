package com.assessment;

public class Solution {
	public static void main(String[] args) {

		LivingThings bird = new Bird();
		LivingThings duck = new SingingBird() {

			@Override
			public void sing() {
				// TODO Auto-generated method stub

			}
		};

		LivingThings chicken = new Mammal() {

			@Override
			public void sing() {
				// TODO Auto-generated method stub

			}
		};

		LivingThings rooster = new Mammal() {

			@Override
			public void sing() {
				// TODO Auto-generated method stub

			}
		};

		LivingThings parrot = new SingingBird() {

			@Override
			public void sing() {
				// TODO Auto-generated method stub
				System.out.println("Woof");
			}
		};

		LivingThings fish = new Fish();

		Fish shark = new Fish();
		shark.setColor("Grey");
		shark.setDoesEatOtherFish(true);
		shark.setSize("Large");

		Fish clownFish = new Fish();
		clownFish.setDoesCrackJokes(true);
		clownFish.setColor("Orange");
		clownFish.setSize("small");

		LivingThings dolphin = new SwimmingAnimal();

		LivingThings frog = new SwimmingAnimal();

		LivingThings dog = new Animal();

		LivingThings butterfly = new Bird();

		LivingThings cat = new Animal();

		LivingThings[] animals = new LivingThings[] { bird, duck, chicken, rooster, parrot, fish, shark, clownFish,
				dolphin, frog, dog, butterfly, cat };

		int flies = 0;
		int walk = 0;
		int sing = 0;
		int swim = 0;

		for (LivingThings livingThings : animals) {

			if (livingThings instanceof Bird) {
				flies++;
			}

			if (livingThings instanceof Animal) {
				walk++;
			}

			if (livingThings instanceof CanSing) {
				sing++;
			}

			if (livingThings instanceof SwimmingAnimal) {
				swim++;
			}

		}

		System.out.println("flies" + flies);
		System.out.println("walk" + walk);
		System.out.println("sing" + sing);
		System.out.println("swim" + swim);

	}
}
