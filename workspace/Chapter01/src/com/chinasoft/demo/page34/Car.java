package com.chinasoft.demo.page34;

public class Car {
	private int site = 4; // 座位数
	
	public Car() {
		System.out.println("载客量是" + site + "人");
	}

	public void setSite(int site) {
		this.site = site;
	}

	public int getSite() {
		return site;
	}

	void print() {
		System.out.print("载客量是" + site + "人");
	}
}
