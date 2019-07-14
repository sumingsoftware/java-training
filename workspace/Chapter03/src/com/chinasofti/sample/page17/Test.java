package com.chinasofti.sample.page17;

public class Test {
	public static void showFly(Bird bird) {
		bird.fly();
	}

	public static void main(String[] args) {
		showFly(new Bird());
		showFly(new Penguin());
	}
}
