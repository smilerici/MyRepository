package ch05.exam05;

public class AdbancedForExample {
	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		
		int sum=0;
		for(int score: scores) {
			sum+= score;
		}
		System.out.println(sum);
	}
}
