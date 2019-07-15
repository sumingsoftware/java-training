package com.chinasofti.page34;

public class RunnableDemo implements Runnable {
    public static void main(String[] args) {
		Thread thread = new Thread(new RunnableDemo());
		thread.start();
	}

	@Override
	public void run() {
        for(int i = 0; i < 10; i++)
        {
        	System.out.println("第" + i + "个数：" + i);
        }
	}
}
