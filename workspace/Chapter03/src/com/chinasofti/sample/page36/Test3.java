package com.chinasofti.sample.page36;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("请输入被除数:");
			int num1 = in.nextInt();
			System.out.print("请输入除数:");
			int num2 = in.nextInt();
			System.out.println(String.format("%d / %d = %d",
					num1, num2, num1/ num2));
			System.out.println("感谢使用本程序！");
		} catch (InputMismatchException e) {
			System.err.println("出现错误：被除数或除数必须是整数，");
			e.printStackTrace();
		}
		
		System.out.println("end...");
	}

}
