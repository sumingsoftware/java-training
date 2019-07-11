package com.chinasoft.demo.page32;

public class Penguin extends Pet {
	public static void main(String[] args) {
		Penguin penguin=new Penguin("happy");
		//Penguin pgn3=new Penguin("qq", 20, 99, "Q妹");
		//pgn3.print();
	}

	String sex = "Q仔";

	public Penguin(String name, int health, int love, String sex) {
		super(name, health, love);
		this.sex = sex;
		System.out.println("child's structor method...");
	}
	
	public Penguin(String name) {
		System.out.println("child's name:" + name);
		System.out.println("child's structor method...");
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
