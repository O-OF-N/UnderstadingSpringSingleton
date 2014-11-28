package com;

public class SingletonShouldNotBeClass {

	private static SingletonShouldNotBeClass singletonShouldNotBeClass = null;
	
	private Integer counter =0 ;

	private SingletonShouldNotBeClass() {

	}

	public static synchronized SingletonShouldNotBeClass getInstance() {
		if (null == singletonShouldNotBeClass) {
			singletonShouldNotBeClass = new SingletonShouldNotBeClass();
		} 
			return singletonShouldNotBeClass;
	}

	public void incrementCounterAndLog(String threadName) {
			System.out.println("before increment by" + threadName + " value="
					+ counter);
			System.out.println("incremented by" + threadName + " value="
					+ ++counter);
	}

}
