	package javabasics;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;
		int firstNum=0;
		int secondNum=1;
		int sum= 0; 
		System.out.println(firstNum+""+secondNum);
		for (int i=2; i<range; ++i)
		{			
		sum=firstNum+secondNum;
		System.out.println(sum);
		firstNum=secondNum;
		secondNum= sum;		
		}		
		
	}

}
