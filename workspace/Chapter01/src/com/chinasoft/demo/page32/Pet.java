package com.chinasoft.demo.page32;

public class Pet {
	// 昵称
	String name = "Parent name";
	
	// 健康值
	int health = 99;
	
	public Pet(String name) {
		System.out.println("Pet parent's name: " + this.name);
		System.out.println("Pet parent's constructor  method.....");
	}
	
	public Pet() {
		System.out.println("Pet parent's name: " + this.name);
		System.out.println("Pet parent's constructor  method.....");
	}

	// 亲密度
	int love = 60;
	
	/* 输出狗的信息 */
    public void print() {
        // 输出狗信息的代码
    	System.out.println("Pet's print method.....");
    }

	public Pet(String name, int health, int love) {
		this.name = name;
		this.health = health;
		this.love = love;
		System.out.println("parent's constroutor method...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("parent's name...");
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}
}
