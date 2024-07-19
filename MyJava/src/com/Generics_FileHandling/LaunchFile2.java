package com.Generics_FileHandling;

import java.io.*;

public class LaunchFile2 {

	public static void main(String[] args) throws IOException {
		File dir = new File("PWJava");
		System.out.println(dir.isDirectory());
		dir.mkdir();
		System.out.println("dir is reffering to pwjava : " + dir.isDirectory());
		
		File file = new File(dir,"pwskill.txt");
		file.createNewFile();
		System.out.println("file is reffering to pwskill.txt : " + file.isFile());
		
		//For counting how much file in a directory
		int count = 0;
		File f = new File("PWJava");
		String str[] = f.list();
		for(String name :str) {
			count++;
			System.out.println(name);
		}
		System.out.println("No of files are : " + count);
	}	

}
