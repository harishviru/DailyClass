package com.har.collection;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

class Temp{
	
}

public class CollectionExampleFour {

	public static void main(String[] args) {

		// hashMap_LinkedHashMap();
		// treeMap();
		// IdentityHashMap();
		//identityHashMap();
		
		//hashMapVsWeakHashMap();
		
		WeakHashMap map = new WeakHashMap();
		Temp temp =new Temp();
		map.put(temp, 101);
		System.out.println(map);
		temp =null;
		 System.gc();
		System.out.println(map);

		
	}

	private static void hashMapVsWeakHashMap() {
		HashMap map = new HashMap();
		Temp temp =new Temp();
		
		map.put(temp, 101);
		System.out.println(map);
		temp =null;
		 System.gc();
		System.out.println(map);
	}

	private static void identityHashMap() {
		HashMap map = new HashMap();
		String s = new String("C");
		String s1 = new String("C");
		
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		map.put(s, "Laxman");
		map.put(s1, "Chandu");
		//System.out.println(map);

		IdentityHashMap ihm = new IdentityHashMap<>();
		ihm.put(s, "Laxman");
		ihm.put(s1, "Chandu");
	   // System.out.println(ihm);
	    
	    
	    IdentityHashMap ihm2 = new IdentityHashMap<>();
	    String      t1     ="C";
	    String      t2    ="C";
	    ihm2.put(t1, "Laxman");
	    ihm2.put(t2, "Chandu");
	    //System.out.println(ihm2);
	    
	    IdentityHashMap ihm3 = new IdentityHashMap<>();
	    String      m1     =new String("Y");
	    String      m2         =new String("Y");
	    ihm3.put(m1, "Laxman");
	    ihm3.put(m2, "Chandu");
	    System.out.println(ihm3);
	}

	private static void IdentityHashMap() {
		HashMap map = new HashMap();
		map.put("A", "Kiran");
		map.put("S", "Suman");
		map.put("C", "Laxman");
		map.put("C", "Chandu");

		System.out.println(map);

		IdentityHashMap ihm = new IdentityHashMap<>();
		ihm.put("A", "Kiran");
		ihm.put("S", "Suman");
		ihm.put("C", "Laxman");
		ihm.put("C", "Chandu");
		System.out.println(ihm);
	}

	private static void treeMap() {
		TreeMap map = new TreeMap(new MyKeyComparator());
		map.put("A", "Kiran");
		map.put("S", "Suman");
		map.put("L", "Laxman");
		map.put("C", "Chandu");

		System.out.println(map);
	}

	private static void hashMap_LinkedHashMap() {
		HashMap map = new LinkedHashMap();
		map.put("K", "Kiran");
		map.put("S", "Suman");
		map.put("L", "Laxman");
		map.put("C", "Chandu");
		map.put("C", "Charan");
		map.put("C", "Cha");
		map.put(null, null);
		map.put(null, "");
		map.put("M", "Laxman");
		map.put("C", "Chiru");

		System.out.println(map.get("K"));
		System.out.println(map.containsKey("L"));
		System.out.println(map.containsKey("T"));
		System.out.println(map.containsValue("Suman"));
		System.out.println(map.containsValue("Sai"));

		System.out.println(map.isEmpty());
		map.replace("M", "Mohan");
		System.out.println(map.get("M"));
		System.out.println(map);
		System.out.println(map.size());

		System.out.println("+++++++++++++++++++++++++");
		Set keys = map.keySet();

		for (Object obj : keys) {
			System.out.println(obj);
		}

		System.out.println("+++++++++++++++++++++++++");
		Collection values = map.values();

		for (Object value : values) {
			System.out.println(value);
		}

		System.out.println("+++++++++++++++++++++++++");
		Set entrySet = map.entrySet();

		System.out.println(entrySet.getClass().getSuperclass());

		Iterator itr = entrySet.iterator();

		while (itr.hasNext()) {
			Object objEntry = itr.next();
			Entry entry = (Entry) objEntry;
			System.out.println(entry.getKey() + "    " + entry.getValue());
		}

		System.out.println(map.isEmpty());
		// map.clear();
		System.out.println(map.isEmpty());

		map.put("B", "Balu");
		map.put("D", "dhanish");
		map.put("E", "Erish");
		map.put("F", "French");
		map.put("G", "Germany");
		map.put("I", "ISLAND");
		map.put("J", "japan");

		System.out.println(map);
	}
}

class MyKeyComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		// return s1.compareTo(s2); ASC
		// return s2.compareTo(s1); //DESC
		return -s1.compareTo(s2);
	}

}
