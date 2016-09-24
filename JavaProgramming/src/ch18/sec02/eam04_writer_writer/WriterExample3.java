package ch18.sec02.eam04_writer_writer;

import java.io.*;

public class WriterExample3 {
	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "홍길동".toCharArray();
			writer.write(data,1,2);
		
		writer.flush();
		writer.close();
	}
}
