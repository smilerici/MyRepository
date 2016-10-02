package com.javalec2.ex;

import java.io.*;

public class MainClass {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("C:/Temp/jaint.txt");
			while(true) {
				int i = is.read();
				System.out.println("데이터 : " +i);
				if(i==-1) break;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(is!=null) {
				try {
					is.close();
				} catch (IOException e) {
					
				}
			}
		}
		
		OutputStream os = null;
	
		try {
			os = new FileOutputStream("C:/Temp/jaint.txt");
			String str = "오늘 날씨는 아g주 좋습니다.";
			byte[] bs = str.getBytes();
			os.write(bs);
		} catch(Exception e) {
			
		} finally {
			if(os!=null) {
				try {
					os.close();
				} catch (IOException e) {
					
				}
			}
		}
	}
}
