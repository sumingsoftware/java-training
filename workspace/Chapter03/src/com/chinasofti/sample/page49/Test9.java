package com.chinasofti.sample.page49;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		// 创建指定文件的流。
		fis = new FileInputStream(new File("accp.txt"));
		// 关闭指定文件的流。
		fis.close();
	}
}
