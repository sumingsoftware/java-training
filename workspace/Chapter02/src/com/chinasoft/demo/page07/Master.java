package com.chinasoft.demo.page07;

import com.chinasoft.demo.page.Dog;
import com.chinasoft.demo.page.Penguin;

public class Master {
	public void Cure(Dog dog) {
		if (dog.getHealth() < 50) {
			dog.setHealth(60);
			System.out.println("打针、吃药");
		}
	}

	public void Cure(Penguin penguin) {
		if (penguin.getHealth() < 50)
		{
			penguin.setHealth(70);
		}
		System.out.println("吃药、疗养");
	}
	
	public static void main(String[] args) {
		Master master = new Master();
		Dog dog = new Dog();
		Penguin penguin = new Penguin();
		master.Cure(dog);
		master.Cure(penguin);
	}
}
