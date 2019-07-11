package com.chinasoft.demo.page16;

public class Penguin {
	private final String SEX_MALE = "Q仔";
	private final String SEX_FEMALE = "Q妹";

	private String name = "qq";

	private int love = 20;

	private int health = 99;

	private String sex = "Q仔";


	public Penguin(String name, int love, int health, String sex) {
		super();
		this.name = name;
		this.love = love;
		this.health = health;
		this.sex = sex;
	}


	public Penguin() {
		super();
	}


	public static void main(String[] args) {
	}
}
