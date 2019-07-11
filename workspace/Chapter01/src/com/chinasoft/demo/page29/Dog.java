package com.chinasoft.demo.page29;

public class Dog extends Pet{
	// 品种
	String strain = "拉布拉多犬";
	
	public Dog() {
		System.out.println(super.love);
	}

	public String getStrain() {
		return strain;
	}

	/* 输出狗的信息 */
    public void print() {
        // 输出狗信息的代码
    	//System.out.println("dog's print method.....");
    	super.print();
    }


	public void setStrain(String strain) {
		this.strain = strain;
	} 
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.print();
	}
}
