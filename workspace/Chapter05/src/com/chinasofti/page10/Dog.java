package com.chinasofti.page10;

public class Dog extends Pet{
	// 昵称
	private String name = "旺财";
	
	// 健康值
	private int health = 10;
	
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

	public Dog(String name, String strain) {
		super();
		this.name = name;
		this.strain = strain;
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

	@Override
	public void toHospital() {
		this.setHealth(60);
		System.out.println("打针，吃药！");
	}

	public void catchingFlyDisc() {
		System.out.println("Dog catching Fly Disc......");
	} 
    
}
