package com.har.lan;

public class Employee implements Cloneable {

	String name;
	int age ;
	Address address;
	public Employee(String name,int age,Address address) {
		this.name = name;
		this.age=age;
		this.address =address;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Address addrs =new Address("Madhapur", 500038, "Hyd");
		Employee eOriginal = new Employee("Harish",20,addrs);
		System.out.println(eOriginal);

		Employee eClonedObj = (Employee) eOriginal.clone();
		System.out.println(eClonedObj);
		
		addrs.city="Vizag";
		System.out.println(eClonedObj);
		
		System.out.println("+++++++++++++++++++++++++++++++");
		
		String s =new String();
		System.out.println(s.getClass().getName());
		String st =new String();
		
		Object obj =st;
		System.out.println(obj.getClass().getName());
		Object obj1=addrs;
		System.out.println(obj1.getClass().getName());

		
		

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Address addrs =new Address(this.address.addrs, this.address.pinCode, this.address.city);
		Employee eOriginal = new Employee(this.name,this.age,addrs);
		return eOriginal;
	}
	
	
	
}
class Address{
	
	String addrs;
	int pinCode;
	String city;
	public Address(String addrs, int pinCode, String city) {
		this.addrs = addrs;
		this.pinCode = pinCode;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [addrs=" + addrs + ", pinCode=" + pinCode + ", city=" + city + "]";
	}
	
}

