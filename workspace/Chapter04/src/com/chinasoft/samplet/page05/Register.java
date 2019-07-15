package com.chinasoft.samplet.page05;

import java.util.Scanner;

public class Register {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String uname, pwd;
		System.out.print("请输入用户名： ");
		uname = input.next();
		System.out.print("请输入密码： ");
		pwd = input.next();
		if (pwd.length() >= 6) {
			System.out.print("注册成功！ ");
		} else {
			System.out.print("密码长度不能小于6位！");
		}
	}
}
