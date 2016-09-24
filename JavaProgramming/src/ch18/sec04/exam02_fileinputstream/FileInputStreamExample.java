package ch18.sec04.exam02_fileinputstream;

import java.io.*;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
		FileInputStream fis = new FileInputStream("D:/kosasw/MyRepository/JavaProgramming/src/ch18/sec04/exam02_fileinputstream/FileInputStreamExample.java");
		int data;
		while((data = fis.read())!=-1) {
			System.out.write(data);
		}
		System.out.flush();
		fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
