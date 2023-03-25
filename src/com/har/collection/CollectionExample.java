package com.har.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class CollectionExample {

	public static void main(String[] args) {

		// linkedList();
		// vector();

		// stack();

		// enumeration();

		// iterator();

		List<Character> l = new ArrayList<>();

		for (int i = 65; i < 123; i++) {
			l.add((char) i);
		}
	
		ListIterator   litr=l.listIterator();
		while(litr.hasNext()) {
		System.out.println( "     --------  "+    litr.previousIndex() +"      -----"+     litr.next()  +"  -----  "+litr.nextIndex());
		
		}
		System.out.println("+++++++++++++++++++++++++++++++++");
		while(litr.hasPrevious()) {
			System.out.println( "     -PP-------  "+    litr.previousIndex() +"      -----"+     litr.previous()  );
		}
		
			for(Character c    :       l) {
				System.out.println(c);
			}
		
		
		
		
		
		
		
		
		
		

	}

	private static void iterator() {
		List l = new ArrayList<>();

		for (int i = 65; i < 123; i++) {
			l.add((char) i);
		}

		System.out.println(l);

		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
			itr.remove();
		}
		System.out.println();

		System.out.println(l);
	}

	private static void enumeration() {
		Vector v = new Vector();
		for (int i = 65; i < 123; i++) {
			v.add((char) i);
		}
		System.out.println(v);

		Enumeration enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}

	private static void stack() {
		Stack s = new Stack<>();

		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");

		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);

		Vector v = s;

		System.out.println(v);
		System.out.println(v.get(0));
		System.out.println(v.firstElement());
	}

	private static void vector() {
		LinkedList ll = new LinkedList<>();

		ll.add("hari");
		ll.add(230);
		ll.add(null);
		ll.add("hari");

		Vector v = new Vector(ll); // 1.0

		System.out.println(v);
		System.out.println(v.get(0));
		System.out.println(v.firstElement());
		System.out.println(v.capacity());
		System.out.println(v.size());

		System.out.println(v);
	}

	private static void linkedLiost() {
		ArrayList al = new ArrayList<>();
		List l = new ArrayList<>();
		Collection cl = new ArrayList<>();

		LinkedList ll = new LinkedList<>();

		ll.add("hari");
		ll.add(230);
		ll.add(null);
		ll.add("hari");

		System.out.println(ll);
		System.out.println(ll.get(0));
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains("hari"));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.indexOf(230));

		System.out.println(ll);
	}

}
