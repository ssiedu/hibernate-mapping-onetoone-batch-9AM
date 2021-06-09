package com.ssi;

import org.hibernate.Session;

public class EmpSearch {

	public static void main(String[] args) {
		Session session=Utility.getSF().openSession();
		Emp emp=session.get(Emp.class, 101);
		System.out.println(emp.getEno());
		System.out.println(emp.getName());
		System.out.println(emp.getSal());
		System.out.println(emp.getDesg());
		System.out.println("Now Asking For Laptop Details Also.............");
		System.out.println(emp.getLaptop());
		//System.out.println(emp.getLaptop().getBrand());
		//System.out.println(emp.getLaptop().getPrice());
		
		/*
		Laptop lapy=emp.getLaptop();
		System.out.println(lapy.getBrand());
		System.out.println(lapy.getPrice());
		*/
		session.close();

	}

}
