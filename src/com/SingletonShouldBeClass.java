package com;

public class SingletonShouldBeClass {
	
	private static SingletonShouldBeClass singletonShouldBeClass = null;

	private SingletonShouldBeClass() {

	}

	public static synchronized SingletonShouldBeClass getInstance() {
		if (null == singletonShouldBeClass) {
			singletonShouldBeClass = new SingletonShouldBeClass();
		} 
			return singletonShouldBeClass;
	}

	public int incrementCounterAndLog(String threadName, int counter) {
			System.out.println("before increment by" + threadName + " value="
					+ counter);
			System.out.println("incremented by" + threadName + " value="
					+ ++counter);
			return counter;
	}

}
