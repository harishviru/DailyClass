package com.har.collection;

public class Employee implements Comparable {

	private int empNo;
	private String empName;

	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + "]";
	}

//	@Override
//	public int compareTo(Object o) {
//	 Employee currentObj =this;
//	 Employee  argEmpObj  =(Employee)o;
//	 return currentObj.getEmpName().compareTo(argEmpObj.getEmpName());
//	}

//	public int compareTo(Object o) {
//		 Employee currentObj =this;
//		 Employee  argEmpObj  =(Employee)o;
//		
//		 int empNo   = currentObj.getEmpNo();
//		int   aEmpNo= argEmpObj.getEmpNo();
//		 
//		if(empNo<aEmpNo) {
//		 return -1;
//		}else if(empNo>aEmpNo) {
//			return +1;
//		}else {
//			return 0;
//		}
//	}

//	public int compareTo(Object o) {
//		 Employee currentObj =this;
//		 Employee  argEmpObj  =(Employee)o;
//		
//		 int empNo   = currentObj.getEmpNo();
//		int   aEmpNo= argEmpObj.getEmpNo();
//		 
//		if(empNo<aEmpNo) {
//		 return 1;
//		}else if(empNo>aEmpNo) {
//			return -1;
//		}else {
//			return 0;
//		}
//	}

	public int compareTo(Object o) {
		Employee currentObj = this;
		Employee argEmpObj = (Employee) o;
		
		
		int empNo = currentObj.getEmpNo();
		int aEmpNo = argEmpObj.getEmpNo();
		
		Integer empnoInt = Integer.valueOf(empNo);
		Integer aEmpNoInt = Integer.valueOf(aEmpNo);
		
		//return   empnoInt.compareTo(aEmpNoInt);   ASC
		//return   aEmpNoInt.compareTo(empnoInt);      DESC
		return    -empnoInt.compareTo(aEmpNoInt);    //DESC
	}

}
