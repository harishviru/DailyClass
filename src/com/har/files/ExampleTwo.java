package com.har.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ExampleTwo {

	
	public static void main(String[] args) throws IOException {
		
		byte[] byteArray = new byte[1024];

		InputStream is = new FileInputStream("enum.txt"); //Reader
		is.read(byteArray);
		
		OutputStream output = new FileOutputStream("sample.txt"); //Writer
		output.write(byteArray);
		
		is.close();
		output.close();
		
	}
	
}
