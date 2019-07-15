package com.chinasofti.page12;

import java.util.ArrayList;
import java.util.List;

import com.chinasofti.page10.Dog;

public class Test2 {
	public static void main(String[] args) {
		Dog ououDog = new Dog("欧欧", "雪娜瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪娜瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");

		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2, feifeiDog); // 添加feifeiDog到指定位置

		System.out.println("共计有" + dogs.size() + "条狗狗。");

		dogs.remove(0);
		dogs.remove(feifeiDog);
		
		System.out.println("\n删除之后还有" + dogs.size() + "条狗狗。");
		
		if(dogs.contains(meimeiDog))
		{
			System.out.println("\n集合中包含美美的信息");
		}
		else
		{
			System.out.println("\n集合中不包含美美的信息");
		}
	}
}
