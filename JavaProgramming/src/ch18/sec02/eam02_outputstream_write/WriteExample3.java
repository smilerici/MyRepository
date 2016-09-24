package ch18.sec02.eam02_outputstream_write;

import java.io.*;

public class WriteExample3 {
	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABC".getBytes();
		os.write(data,1,2);
		os.flush();
		os.close();
	}
}
