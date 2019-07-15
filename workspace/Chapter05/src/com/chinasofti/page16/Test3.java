package com.chinasofti.page16;

import java.util.LinkedList;

import com.chinasofti.page10.Dog;

public class Test3 {
    public static void main(String[] args) {
    	Dog ououDog = new Dog("欧欧", "雪娜瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪娜瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");

		LinkedList<Dog> dogs = new LinkedList<Dog>();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2, feifeiDog); // 添加feifeiDog到指定位置
		
		Dog dogFirst= (Dog)dogs.getFirst();
		System.out.println("第一条狗狗昵称是"+dogFirst.getName() );
		
		Dog dogLast= (Dog)dogs.getLast();
		System.out.println("最后一条狗狗昵称是"+dogLast.getName());
				
		dogs.removeFirst();
		dogs.removeLast();
		
		if(!dogs.contains(ououDog))
		{
			System.out.println("欧欧被删除了！");
		}

		if(!dogs.contains(meimeiDog))
		{
			System.out.println("美美被删除了！");
		}
	}
}
