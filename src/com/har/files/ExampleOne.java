package com.har.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExampleOne {

	public static void main(String[] args) throws IOException {
		System.out.println("ExampleOne.main()");

		byte[] byteArray = new byte[1024];

		InputStream is = new FileInputStream("enum.txt");
		is.read(byteArray);

		String response = new String(byteArray);
		System.out.println(response);

		is.close();

	}

}
