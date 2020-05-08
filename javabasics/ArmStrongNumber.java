package javabasics;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=153;
		int cal = 0;
		int rem;
		int original;
		original = input;
		while(input>0)
		{
			rem=input%10;
			input= input/10;
			cal=cal+(rem*rem*rem);
		}

		if(cal == original)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
	}
	

}
