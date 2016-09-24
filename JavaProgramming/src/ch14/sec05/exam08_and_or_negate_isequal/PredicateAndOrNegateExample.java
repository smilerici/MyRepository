package ch14.sec05.exam08_and_or_negate_isequal;

import java.util.function.*;

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		
	//2의 배수를 검사
	IntPredicate predicateA = a -> a%2 ==0;
	
	//3의 배수를 검사
	IntPredicate predicateB = a -> a%3 ==0;
	
	IntPredicate predicateAB;
	boolean result;
	
	//and()
	predicateAB = predicateA.and(predicateB);
	result = predicateAB.test(9);
	System.out.println("9는 2와 3의 배수입니까? ");
	
	//or()
	predicateAB = predicateA.or(predicateB);
	result = predicateAB.test(9);
	System.out.println("9는 2또는 3의 배수입니까? ");
	
	//negate()
	predicateAB = predicateA.negate();
	result = predicateAB.test(9);
	System.out.println(result);
	System.out.println("9는 홀수입니까? "+result);
	}
	
}
