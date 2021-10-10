package com.java.app4;

class Customer implements Cloneable{
	
		int CustomerId;
		String CustomerName;
		double CustomerCon;
		
		
		public Customer(int CustomerId, String CustomerName, double CustomerCon) {
			
			super();
			this.CustomerId = CustomerId;
			this.CustomerName = CustomerName;
			this.CustomerCon = CustomerCon;
		}
		public Object clone() throws CloneNotSupportedException{
			return super.clone();
		}
}

public class Clone {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Customer r1 = new Customer(101,"Sam",775588994);
		
		Customer r2 = (Customer)r1.clone();
		
		//Deep cloning
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		System.out.println(r1.equals(r2));
		
		//Shallow Cloning
		
		Customer r3 = r1;
		System.out.println(r3.hashCode());
		System.out.println(r3.equals(r1));
		
		
	}

}
