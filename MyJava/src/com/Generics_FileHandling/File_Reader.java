package com.Generics_FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File_Reader {

	public static void main(String[] args) throws Exception {
		File dir = new File("PWJava");
		File file = new File(dir,"ab.txt");
		
		FileReader fd = new FileReader(file);
		int i = fd.read();
		 
		while (i != -1) {
			System.out.println((char)i);
			i = fd.read();
		}
	}

}
