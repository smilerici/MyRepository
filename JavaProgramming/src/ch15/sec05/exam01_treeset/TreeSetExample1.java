package ch15.sec05.exam01_treeset;

import java.util.*;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(93));
		scores.add(new Integer(80));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수 : "+score);
		
		score = scores.last();
		System.out.println("가장 높은 점수 : "+score+"\n");
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수 : "+score);
		
		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수 : "+score);
		
		score = scores.floor(new Integer(95)); //95 포함 아래 (<=)
		System.out.println("95점 이거나 바로 아래 점수 : "+score);
		
		score = scores.ceiling(new Integer(85));
		System.out.println("85점 이거나 바로 위의 점수 : "+score);
		
		while(!scores.isEmpty()) {
			score = scores.pollLast();
			System.out.println(score+"(남은 객체 수 : "+scores.size()+")");
		}
		
		/*Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			int s= iterator.next();
			iterator.remove();
			System.out.println(score+"(남은 객체 수 : "+scores.size()+")");
		}*/
	}
}
