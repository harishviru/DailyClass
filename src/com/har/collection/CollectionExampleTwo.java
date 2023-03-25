package com.har.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionExampleTwo {

	
	public static void main(String[] args) {
		
		//hashset();

		//linkedHashSet();
		
		
	}


	private static void linkedHashSet() {
		LinkedHashSet hs =new LinkedHashSet();
		String name ="Vamsi";

		
		hs.add(name);
		hs.add(null);
		hs.add(name);
		hs.add(123);
		hs.add(34.0f);
		hs.add(null);
		hs.add(123);
		System.out.println(hs);
	}


	private static void hashset() {
		HashSet hs =new HashSet();
		String name ="Vamsi";
		
		hs.add(name);
		hs.add(null);
		hs.add(name);
		hs.add(123);
		hs.add(34.0f);
		hs.add(null);
		hs.add(123);

		
		
		System.out.println(hs);
		
		int hash  =hash(name);
		
		System.out.println(hash);

		System.out.println(hs);
		
		
		System.out.println(hs.isEmpty());

		System.out.println(hs.contains("Vamsi"));
		
		System.out.println(hs.size());
		
		Iterator itr=        hs.iterator();
		while(itr.hasNext()) {
			  Object o = itr.next();
			   System.out.println(o);
		}
		
		//hs.clear();
		
		for(int i=0;i<16;i++) {
			hs.add(" Java Devils  "+i);
		}
		
		

		System.out.println(hs.isEmpty());
		
		System.out.println(hs);
	}
	
	  
	    static final int hash(Object key) {
	        int h;
	        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
	    }
	
}
