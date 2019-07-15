package com.chinasofti.page26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.chinasofti.page10.Dog;

public class Test6 {
	public static void main(String[] args) {
		// 1、创建多个狗狗对象
		Dog ououDog = new Dog("欧欧", "雪娜瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪娜瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");
		
		// 2、创建ArrayList集合对象并把多个狗狗对象放入其中
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2, feifeiDog); // 添加feifeiDog到指定位置
		
		System.out.println("使用for遍历，所有狗狗昵称和品种是:");
		
		for(int i = 0; i < dogs.size(); i++)
		{
			Dog dog = (Dog) dogs.get(i);
			System.out.println(dog.getName()+"\t"+dog.getStrain());
		}
	}

}
