package ch18.sec02.eam02_outputstream_write;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) throws Exception{
		
	OutputStream os = new FileOutputStream("C:/Temp/test.txt");
	byte[] data = "ABC".getBytes();
	for(int i=0;i<data.length;i++) {
		os.write(data[i]);
	}
	os.flush();
	os.close();
	}
	
}
