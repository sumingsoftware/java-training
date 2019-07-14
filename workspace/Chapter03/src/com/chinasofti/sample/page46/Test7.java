package com.chinasofti.sample.page46;

import java.util.Scanner;

public class Test7 {
	public static void divide() throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入被除数:");
		int num1 = in.nextInt();
		System.out.print("请输入除数:");
		int num2 = in.nextInt();
		System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
	}

	public static void main(String[] args) {
		try {
			divide();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// public static void main(String[] args) throws Exception {
	// divide();
	// }

}
