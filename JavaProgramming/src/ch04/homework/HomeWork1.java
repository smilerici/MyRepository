package ch04.homework;

public class HomeWork1 {
	public static void main(String[] args) {
		int sum=0; //주사위의 합이 저장될 변수 sum
		for(int i=0;i<100;i++) { //주사위 두개를 100번 던진다. i가 0 부터 99 가 될때까지 블럭안의 값 반복 실행
			int num1 = (int)(Math.random()*6)+1; // 0*6<=Math.random()*6 <1*6  => 0부터 6 이하의 실수난수 발생
												 // 0*6<=(int)(Math.random()*6) <1*6 => 0부터 6이하의 정수 난수 발생
												 // 0*6+1<=(int)(Math.random()*6)+1 <1*6+1 => 1,2,3,4,5,6 중 하나의 정수 발생
												 //값을 int 형 변수 num1 에 저장
			int num2 = (int)(Math.random()*6)+1; 
			sum = num1+num2; //num1의 값과 num2의 값을 더한다.
			if(sum==10) { //sum의 값이 10 일때 블럭안의 값을 출력
				System.out.println("("+num1+","+num2+")"); //sum의 값이 10일때의 num1과 num2 출력
			}

		}
	}
}
