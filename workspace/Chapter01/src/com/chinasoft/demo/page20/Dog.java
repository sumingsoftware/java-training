package com.chinasoft.demo.page20;

public class Dog {
	private String name = "旺财"; // 昵称
	private int health = 100; // 健康值
	private int love = 0; // 亲密度
	private String sex = "雌"; // 亲密度
	private String strain = "拉布拉多犬"; // 品种
	public Dog(String name, int health, int love, String sex) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
		this.sex = sex;
	}
	public Dog(String name, int health, int love, String sex, String strain) {
		this("小黑",100,100,"雄");
		this.strain = strain;
	}
}
