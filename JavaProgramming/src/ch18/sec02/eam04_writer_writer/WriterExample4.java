package ch18.sec02.eam04_writer_writer;

import java.io.*;

public class WriterExample4 {
	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test.txt");
		String data = "안녕 자바 프로그램";
		//writer.write(data);
		writer.write(data,3,2);
		
		writer.flush();
		writer.close();
	}
}
