package com.chinasofti.page23;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.chinasofti.page10.Dog;

public class Test5 {
	public static void main(String[] args) {
		Dog ououDog = new Dog("欧欧", "雪娜瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪娜瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");

		Map<String, Dog> dogsMap = new HashMap<String, Dog>();
		dogsMap.put("欧欧", ououDog);
		dogsMap.put("亚亚", yayaDog);
		dogsMap.put("美美",meimeiDog);
		dogsMap.put("菲菲", feifeiDog); // 添加feifeiDog到指定位置

		System.out.println("共计有" + dogsMap.size() + "条狗狗。");

		System.out.println("分别是：");
		
		for(Entry<String, Dog> entry: dogsMap.entrySet())
		{
			
			System.out.println(entry.getKey() + "\t" + entry.getValue().getStrain());
		}
		
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println(dogsMap.get("欧欧").getStrain());
	}
}
