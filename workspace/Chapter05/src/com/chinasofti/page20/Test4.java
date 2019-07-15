package com.chinasofti.page20;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public static void main(String[] args) {
    	Map<String, String> countriesMap = new HashMap<String, String>();
		countriesMap.put("CN", "中华人民共和国");
		countriesMap.put("RU", "俄罗斯联邦");
		countriesMap.put("FR", "法兰西共和国");
		countriesMap.put("US", "美利坚合众国");
		
		String country = (String) countriesMap.get("CN");
		System.out.println("CN对应的国家是：" + country);
		
		System.out.println("Map中共有"+countriesMap.size()+"组数据");
		
		countriesMap.remove("FR");
		System.out.println("Map中包含FR的key吗？" + 
				countriesMap.containsKey("FR"));
		
		System.out.println( countriesMap.keySet() ) ;
		System.out.println( countriesMap.values() );
		System.out.println( countriesMap);
	}
}
