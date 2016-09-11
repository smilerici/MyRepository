package ch11.verify;

import java.util.*;

public class SplitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		//방법 1 (splict() 메소드 이용)
		String[] tokens = str.split(",");
		for(String token : tokens) {
			System.out.println(token);
		}
		System.out.println();
		
		//방법 2 (StringTokenizer 이용)
		StringTokenizer st= new StringTokenizer(str,"/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			
		}		
		
	}
}
