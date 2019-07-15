package com.chinasofti.page10;

public abstract class Pet {
	private int health;
    public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public abstract void toHospital();
}
