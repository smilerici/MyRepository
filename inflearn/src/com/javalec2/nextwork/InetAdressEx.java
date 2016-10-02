package com.javalec2.nextwork;

import java.net.*;
import java.util.*;

public class InetAdressEx {

	Scanner scanner;
	
	public InetAdressEx() {
		System.out.println("Host 이름을 입력 하세요.");
	
		scanner = new Scanner(System.in);
		
		try {
			InetAddress inetAddress = InetAddress.getByName(scanner.next());
			
			System.out.println("Computer NAME : "+inetAddress.getHostName());
			System.out.println("Computer IP : "+inetAddress.getHostAddress());;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
