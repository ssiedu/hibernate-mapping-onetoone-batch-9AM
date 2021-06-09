package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		Laptop l1=new Laptop("L1");
		Laptop l2=new Laptop("L2");
		Laptop l3=new Laptop("L3");
		Emp e1=new Emp(101,"AAA",44000,"SE",l1);
		Emp e2=new Emp(102,"BBB",55000,"SSE",l2);
		Emp e3=new Emp(103,"CCC",66000,"TL",l3);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		tr.commit();
		session.close();
		System.out.println("Data Stored...!");
		
	}

}
