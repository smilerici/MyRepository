package ch18.sec04.exam03_fileoutputstream;

import java.io.*;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception{
		String originalFileName = "D:/kosasw/MyRepository/JavaProgramming/src/ch18/sec04/exam03_fileoutputstream/fff.jpg";
		String targetFileName = "C:/Temp/fff.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes))!=-1) {
			fos.write(readBytes,0,readByteNo);
		}
		
		fos.flush();
		fis.close();
		fos.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}
