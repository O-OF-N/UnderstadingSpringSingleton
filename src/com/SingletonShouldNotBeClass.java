package com;

public class SingletonShouldNotBeClass {

	private static SingletonShouldNotBeClass singletonShouldNotBeClass = null;
	
	private Integer counter =0 ;
	
	//private ThreadLocal<Integer> counter = new ThreadLocal<>();//Possible Fix

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
	
	
	//Possible fix(uncomment these lines to understand how to fix using thread local variables).
	//Do remember to comment the other method.
	/*public void incrementCounterAndLog(String threadName) {
		if(counter.get() == null)
			counter.set(0);
		System.out.println("before increment by" + threadName + " value="
				+ counter.get());
		counter.set(counter.get()+1);
		System.out.println("incremented by" + threadName + " value="
				+ counter.get());
	}*/

}
