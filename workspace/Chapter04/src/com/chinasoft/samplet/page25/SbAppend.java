package com.chinasoft.samplet.page25;

public class SbAppend {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("青春无悔");
		int num = 110;
		StringBuffer sb1 = sb.append("我心永恒");
		System.out.println(sb1);
		StringBuffer sb2 = sb1.append('啊');
		System.out.println(sb2);
		StringBuffer sb3 = sb2.append(num);
		System.out.println(sb3);
	}
}
