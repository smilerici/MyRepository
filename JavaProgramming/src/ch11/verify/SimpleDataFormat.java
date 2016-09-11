package ch11.verify;

import java.text.*;
import java.util.*;

public class SimpleDataFormat {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 MM분");
		System.out.println(sdf.format(now));
	}
}
