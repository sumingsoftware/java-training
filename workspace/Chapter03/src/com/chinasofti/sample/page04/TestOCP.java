package com.chinasofti.sample.page04;

public class TestOCP {
	public static void main(String[] args) {
		Accountant accountant = new Accountant();
		accountant.ComputerSalary(new Salary());
	}
}
