package ch18.sec02.eam04_writer_writer;

import java.io.*;

public class WriterExample1 {
	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "홍길동".toCharArray();
		for(int i=0;i<data.length;i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
	}
}
