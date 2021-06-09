package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LaptopEntry {

	public static void main(String[] args) {
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(new Laptop("L1","Dell",50000));
		session.save(new Laptop("L2","Lenovo",60000));
		session.save(new Laptop("L3","HP",70000));
		tr.commit();
		session.close();
		System.out.println("Data Stored...!");
		
	}

}
