package com.Generics_FileHandling;
import java.io.*;

public class File_Writer {
	public static void main(String[] args) throws IOException {
		File dir = new File("PWJava");
		File file = new File(dir,"ab.txt");
		//file.createNewFile();
		FileWriter fw = new FileWriter(file,true);
		fw.write("lambda");
		fw.write("\n");
		fw.write(65);
		fw.write("\n");
		fw.write(97);
		fw.write("\n");
		char ch [] = {'j','a','v','a'};
		fw.write(ch);
		fw.write("\n");
		
		fw.close();
		System.out.println("open ab.txt to see the result");
	}
}
