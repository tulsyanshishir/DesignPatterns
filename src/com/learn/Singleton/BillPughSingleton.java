package com.learn.Singleton;

public class BillPughSingleton {
	
	private BillPughSingleton() {}
	
	private static class BillPughSC {
	 static final BillPughSingleton instance = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return BillPughSC.instance;
	}
}
