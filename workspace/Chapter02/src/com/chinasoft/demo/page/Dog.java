package com.chinasoft.demo.page;

public class Dog {
	// 昵称
	private String name = "旺财";
	
	// 健康值
	private int health = 100;
	
	// 亲密度
	private int love = 0;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
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

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	// 品种
	String strain = "拉布拉多犬";
	
	/* 输出狗的信息 */
    public void print() {
        // 输出狗信息的代码
    	System.out.println("dog sleeping.....");
    } 
    
}
