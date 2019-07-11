package com.chinasoft.demo.page19;

public class Dog {
	private String name = "旺财"; // 昵称
	private int health = 100; // 健康值
	private int love = 0; // 亲密度
	private String strain = "拉布拉多犬"; // 品种

	public int getHealth() {
		return health;
	}

	public int getLove() {
		return love;
	}

	// 其它getter/setter方法
	public String getName() {
		return name;
	}

	public String getStrain() {
		return strain;
	}

	public void setHealth(int health) {
		if (health > 100 || health < 0) {
			this.health = 40;
			System.out.println("健康值应该在0和100之间，默认值是40");
		} else
			this.health = health;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

}
