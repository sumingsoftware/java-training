package com.chinasofti.page34;

public class ThreadDemo extends Thread {
    public static void main(String[] args) {
		Thread thread = new ThreadDemo();
		thread.start();
		//thread.run();
	}

	@Override
	public void run() {
		for(int i =0; i < 10; i++)
		{
			System.out.println("第" + i + "个数：" + i);
		}
		System.out.println(Thread.currentThread().getName());
	}
}
