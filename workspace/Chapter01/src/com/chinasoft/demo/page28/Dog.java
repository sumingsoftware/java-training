package com.chinasoft.demo.page28;

public class Dog extends Pet{
	// 昵称
	String name = "旺财";
	
	// 健康值
	int health = 100;
	
	// 亲密度
	int love = 0;
	
	// 品种
	String strain = "拉布拉多犬";
	
	public Dog() {
		System.out.println(super.love);
	}

	public int getHealth() {
		return health;
	}

	public int getLove() {
		return love;
	}

	public String getName() {
		return name;
	}

	public String getStrain() {
		return strain;
	}

	/* 输出狗的信息 */
    public void print() {
        // 输出狗信息的代码
    	System.out.println("dog's print method.....");
    }

	public void setHealth(int health) {
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
