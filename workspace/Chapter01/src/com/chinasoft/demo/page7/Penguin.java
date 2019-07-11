package com.chinasoft.demo.page7;

public class Penguin {
	private String name = "qq";

	private int love = 20;

	private int health = 99;

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
}
