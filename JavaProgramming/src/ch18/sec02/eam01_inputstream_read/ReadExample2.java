package ch18.sec02.eam01_inputstream_read;

import java.io.*;

public class ReadExample2 {
	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";
		/*while((readByteNo = is.read(readBytes))!=-1) {
			System.out.println(readByteNo);
		}*/
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo==-1) break;
			data += new String(readBytes,0,readByteNo);
		}
		System.out.println(data);
		is.close();
	}
	
}
