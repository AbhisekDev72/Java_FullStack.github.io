package com.Generics_FileHandling;

import java.io.File;
import java.io.IOException;

public class LaunchFile {

	public static void main(String[] args) throws IOException {
		File file = new File("pw.txt");
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println(file.exists());

	//For Directory
		File dir = new File("pw");
		System.out.println(dir.exists());
		dir.mkdir();
		System.out.println(dir.exists());
		
	}

}
