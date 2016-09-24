package ch18.sec04.exam04_file_reader;

import java.io.*;

public class FileReaderExample {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("D:/kosasw/MyRepository/JavaProgramming/src/ch18/sec04/exam04_file_reader/FileReaderExample.java");
	
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=fr.read(cbuf))!=-1) {
			String data = new String(cbuf,0,readCharNo);
			System.out.println(data);
		}
		fr.close();
	}
}
