package ch14.sec05.exam04_function;

import java.util.*;
import java.util.function.*;

public class FunctionExample2 {
	
		private static List<Student> list = Arrays.asList(
			new Student("홍길동",90,96),
			new Student("한주은",95,93)
		);

		
		public static double avg(ToIntFunction<Student> function) {
			int sum = 0;
			for(Student student :list) {
				sum += function.applyAsInt(student);
			}
			double avg = sum/list.size();
			return avg;
		}
		

	public static void main(String[] args) {
		double englishAvg = avg( t -> t.getEnglishScore());
		System.out.println("영어 평균 점수 : "+englishAvg);
		
		double mathAvg = avg(t -> t.getMathScore());
		System.out.println("수학 평균 점수 : "+mathAvg);
	}	
}
