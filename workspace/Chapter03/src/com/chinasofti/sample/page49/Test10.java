package com.chinasofti.sample.page49;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test10 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {			
			fis = new FileInputStream(new File("accp.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("无法找到指定文件！");			
		}
		try {
			fis.close();
		} catch (IOException e) {
			System.err.println("关闭指定文件输入流时出现异常！");
		}
	}
}
