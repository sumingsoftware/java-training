package com.chinasofti.sample.page44;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) 
	{
		try 
		{
			Scanner in = new Scanner(System.in);
			System.out.print("请输入课程编号:");
			int num1 = in.nextInt();
			
			if(1 == num1)
			{
				System.out.print("Java编程基础");
			}
			else if(2 == num1)
			{
				System.out.print("KAFKA实战与源码剖析");
			}
			else if(3 == num1)
			{
				System.out.print("Dubbo实战");
			}
		} 
		catch (InputMismatchException e) 
		{
			System.err.println("课程编号必须是整数。");
		} 
		finally {
			System.out.println("欢迎提出建议");
		}
	}

}
