package com.ssi;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Emp {
	@Id
	private int eno;
	private String name;
	private int sal;
	private String desg;
	@OneToOne 					//(fetch=FetchType.LAZY)
	private Laptop laptop;		
	
	public Emp() {
		super();
	}

	public Emp(int eno, String name, int sal, String desg, Laptop laptop) {
		super();
		this.eno = eno;
		this.name = name;
		this.sal = sal;
		this.desg = desg;
		this.laptop = laptop;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", name=" + name + ", sal=" + sal + ", desg=" + desg + ", laptop=" + laptop + "]";
	}
	
	
	
	
}
