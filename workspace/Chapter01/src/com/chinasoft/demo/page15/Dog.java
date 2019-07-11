package com.chinasoft.demo.page15;

public class Dog {
	private String name = "旺财"; // 昵称
	private int health = 100; // 健康值
	private int love = 0; // 亲密度

	public void play(int n) {
		static int localv = 5;
		health = health - n;
		System.out.println(name + " " + localv + " " + health + " " + love);
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.play(5);
	}
}
