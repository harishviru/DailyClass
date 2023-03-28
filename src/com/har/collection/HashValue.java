package com.har.collection;

public class HashValue {

	
	public static void main(String[] args) {
		
		int hash =65;
		int length   =11;
		System.out.println((hash & 0x7FFFFFFF)%11);
		
	}
}
