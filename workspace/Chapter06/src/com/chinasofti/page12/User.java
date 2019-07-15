package com.chinasofti.page12;

public class User {
    private int id;
    
    private String name;
    
    private int age;
    private int sex;
    
    public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public User(String name, int age, int sex, float high) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.high = high;
	}

	private float high;

	public int getId() {
		return id;
	}

	public User(int id, String name, int age, float high) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.high = high;
	}

	public User() {
		super();
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", high=" + high + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHigh() {
		return high;
	}

	public void setHigh(float high) {
		this.high = high;
	}
}
