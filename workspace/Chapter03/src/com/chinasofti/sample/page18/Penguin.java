package com.chinasofti.sample.page18;

public class Penguin extends Pet{
	private String name = "qq";

	private int love = 20;

	private int health = 9;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	private String sex = "Q仔";

	// 属性
	/* 无参构造方法 */
	/*
	 * public Penguin() { name = "qq"; love = 20; sex = "Q仔";
	 * System.out.println("执行构造方法"); }
	 */
	public void Penguin() {
		health = 10;
		sex = "雄";
		System.out.println("执行构造方法");
	}

	/**
	 * 打印信息
	 */
	public void print() {
		System.out.println("企鹅的名字是" + name + ",健康值是" + health + ",性别是" + sex);
	}

	public static void main(String[] args) {
	/*	Penguin pgn = new Penguin();
		pgn.name = "qq2";
		pgn.sex = "Q仔1";

		System.out.println(pgn.health);
		Penguin pgn1 = new Penguin();*/
		
		Penguin pgn3=new Penguin();
		pgn3.print();
	}

	@Override
	public void toHospital() {
		this.setHealth(70);
		System.out.println("吃药！疗养！");
	}

	public void swimming() {
		System.out.println("Penguin swimming......");
	}
}
