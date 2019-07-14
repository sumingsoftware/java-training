package com.chinasofti.sample.page18;

public class Test {
	public static void showPlay(Pet pet) {
		if (pet instanceof Dog) {
			Dog dog = (Dog) pet;
			dog.catchingFlyDisc();
		} else if (pet instanceof Penguin) {
			Penguin pgn = (Penguin) pet;
			pgn.swimming();
		}
	}

	public static void main(String[] args) {
		Dolphin dolphin = new Dolphin();
		showPlay(dolphin);
	}
}
