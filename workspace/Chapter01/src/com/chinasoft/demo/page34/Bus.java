package com.chinasoft.demo.page34;

public class Bus extends Car {
    private String color = "red";
	
	public Bus(int site){
        setSite(site);
        this.color = "white";
    }
	
	public static void main(String[] args) { 
	    Bus bus = new Bus(20);
	    bus.print();
	}
	
	void print() {
		System.out.print("Bus载客量是" + super.getSite() + "人, " + "颜色是：" + this.color);
	}
}
