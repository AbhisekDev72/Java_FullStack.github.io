package com.APIsAnnotation;

import java.io.*;
import java.util.*;

public class PropertiesStream {
	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("./src/com/APIsAnnotation/abc.properties");
		props.load(fis);
		System.out.println(props);
		
		System.out.println("URL is :: "+ props.getProperty("url"));
		System.out.println("UNAME is :: "+ props.getProperty("user"));
		System.out.println("PASSWORD is :: "+ props.getProperty("password"));
		
		props.setProperty("RCB" , "Kohli");
		
		FileOutputStream fos = new FileOutputStream("./src/com/APIsAnnotation/abc.properties");
		props.store(fos, "Java with DSA 2.O");
	}
}
