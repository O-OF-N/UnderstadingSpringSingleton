package com;

public class MainClass {

	public class Thread1 extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++)
				SingletonShouldNotBeClass.getInstance().incrementCounterAndLog("thread1");
		}

	}

	public class Thread2 extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++)
				SingletonShouldNotBeClass.getInstance().incrementCounterAndLog("thread2");
		}

	}
	
	public class Thread3 extends Thread {
		int counter = 0;
		@Override
		public void run() {
			
			for (int i = 0; i < 10; i++)
				counter = SingletonShouldBeClass.getInstance().incrementCounterAndLog("thread3",counter);
		}

	}

	public class Thread4 extends Thread {
		int counter = 0;
		@Override
		public void run() {
			for (int i = 0; i < 10; i++)
				counter = SingletonShouldBeClass.getInstance().incrementCounterAndLog("thread4",counter);
		}

	}

	public static void main(String[] args) {
		MainClass m1 =new MainClass();
		/*should not be*/
		Thread1 t1 = m1.new Thread1();
		Thread2 t2 = m1.new Thread2();
		t1.start();
		t2.start();
		
		/*should not be*/
		Thread3 t3 = m1.new Thread3();
		Thread4 t4 = m1.new Thread4();
		//t3.start();
		//t4.start();
		
	}
}
