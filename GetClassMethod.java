package com.java.app5;
import java.util.Arrays;


class Employee1{
	public int employeeId;
	public String employeeName;
	public double employeeContact;
	
	public Employee1() {
		
	}
	
	public Employee1(int employeeId, String employeeName, double employeeContact) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeContact = employeeContact;
		
	}
	
	public void m1() {
	}
	
	public void m2() {}
	
	public void m3() {}
	
}

public class GetClassMethod{
	public static void main(String[] args) {
	
		Employee1 e = new Employee1(101,"Sam",778546524);
		Class c = e.getClass();
		System.out.println(c);
		System.out.println(Arrays.toString(c.getClasses()));
		System.out.println(Arrays.toString(c.getMethods()));
		System.out.println(Arrays.toString(c.getFields()));
		
	}
}