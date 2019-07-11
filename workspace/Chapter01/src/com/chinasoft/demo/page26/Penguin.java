package com.chinasoft.demo.page26;

public class Penguin {
	public static void main(String[] args) {
		Penguin pgn3=new Penguin();
		pgn3.print();
	}

	private String name = "qq";

	private int love = 20;

	private int health = 99;

	private String sex = "Q仔";

	public Penguin() {
		super();
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

	public String getSex() {
		return sex;
	}

	/**
	 * 打印信息
	 */
	public void print() {
		System.out.println("企鹅的名字是" + name + ",健康值是" + health + ",性别是" + sex);
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

	public void setSex(String sex) {
		this.sex = sex;
	}
}
