package ch18.sec05.exam05_bufferedoutputstream;

import java.io.*;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream("D:/kosasw/MyRepository/JavaProgramming/src/ch18/sec05/exam03_buffredinputstream/fff.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/forest.jpg");
		start = System.currentTimeMillis();
		while((data= bis.read())!=-1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("사용하지 않았을 떄 : "+(end-start)+"ms");
		
		fis = new FileInputStream("D:/kosasw/MyRepository/JavaProgramming/src/ch18/sec05/exam03_buffredinputstream/fff.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/forest.jpg");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data= bis.read())!=-1) {
			bos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("사용했을 떄 : "+(end-start)+"ms");
		
	
	}
}
