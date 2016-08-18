package ch04.homework;
	
public class Homework2 {
	public static void main(String[] args) {
		
		for(int x=1;x<=10;x++) {// int형 변수 x에 1부터 10까지의 값을 반복 저장
			for(int y=1;y<=10;y++) {// int 형 변수 y에 1부터 10까지의 값을 반복 저장
				if(4*x+5*y==60) { //4*x+5*y 값이 60 일때 블럭안의 값 출력
					System.out.println("("+x+","+y+")");
				}				
			}
		}
	}
}
