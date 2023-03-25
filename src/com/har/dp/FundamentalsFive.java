package com.har.dp;

public class FundamentalsFive {

	public static void main(String[] args) {
		// Array syntax :
		// <DataType/ClassName> <ref>[] = new <DataType/ClassName>[size];

		int[] a; // declaration

		int[] b = new int[3]; // Array construction

		b[2] = 90; // array inilization

		int[] d = new int[5];
		System.out.println("++++++++++++++++++++++++++++++");

		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);
		System.out.println(d[4]);
		//System.out.println(d[5]);


		d[0] = 90;
		d[1] = 20;
		d[2] = 30;
		d[3] = 10;
		d[4] = 60;

		System.out.println("++++++++++++++++++++++++++++++");

		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);
		System.out.println(d[4]);

		System.out.println("++++++++++++++++++++++++++++++");

		System.out.println(d.length);
		System.out.println();

		for (int k = 0; k < d.length; k++) {
			System.out.println(d[k]);
		}

	}
}
