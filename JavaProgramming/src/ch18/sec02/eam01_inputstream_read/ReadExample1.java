package ch18.sec02.eam01_inputstream_read;

import java.io.*;

public class ReadExample1 {
	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByte;
		/*while((readByte=is.read())!=-1) {
			System.out.println(readByte);
		}*/
		while(true) {
			readByte = is.read();
			if(readByte==-1) break;
			System.out.println((char)readByte);
		}
		is.close();
	}
}
