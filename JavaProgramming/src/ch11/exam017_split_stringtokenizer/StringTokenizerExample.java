package ch11.exam017_split_stringtokenizer;

import java.util.*;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text= "홍길동/이수홍/박연수";
		
		StringTokenizer st= new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		System.out.println(countTokens);
		for(int i=0;i<countTokens;i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		st= new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			
		}
	}
}
