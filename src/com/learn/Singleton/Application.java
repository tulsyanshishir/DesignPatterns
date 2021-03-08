package com.learn.Singleton;

public class Application {

	public static void main(String[] args) {
		
		Database db1 = Database.getInstance();
		Database db2 = Database.getInstance();
		System.out.println(db1.hashCode());
		System.out.println(db2.hashCode());
		System.out.println(db1.equals(db2));
		
		BillPughSingleton ins1 = BillPughSingleton.getInstance();
		BillPughSingleton ins2 = BillPughSingleton.getInstance();
		System.out.println(ins1.hashCode());
		System.out.println(ins2.hashCode());
		System.out.println(ins1.equals(ins2));

	}

}
