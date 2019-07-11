package com.chinasoft.demo.page14;

public class Penguin {
	static final String SEX_MALE="Q仔"; 
    static final String SEX_FEMALE="Q妹";
    
    private static String name = "qq";

	private static int love = 20;

	private static int health = 99;

	private static String sex = "Q仔";
	
    
	/**
	 * 打印信息
	 */
	public static void print() {
		System.out.println("企鹅的名字是" + name + ",健康值是" + health + ",性别是" + sex);
	}

	public static void main(String[] args) {
		System.out.println("name: " + Penguin.name);
		System.out.println("love: " + Penguin.love);
		System.out.println("health: " + Penguin.health);
		System.out.println("sex: " + Penguin.sex);
	}
}
