package javabasics;

public class SumOfDigits {

	
	public static void main(String[] args) {
		int input = 123;

		int rem;
		int sum = 0;
		int sum1;
		int num = 0;
		int num1;
		int num2;
		int num3 = 0;
		int total;
		int total1 = 0;

		if (input > 0) {
			rem = input % 10;
			sum1 = rem + sum;
			System.out.println(sum1);
			num = input - sum1;
			if (num > 10) {

				num1 = num / 10;
				System.out.println(num1);
				num2 = num1 / 10;
				System.out.println(num2);
				num3 = num1 % 10;
				System.out.println(num3);

			} else {
				num2 = input / 10;

			}

			total1 = num2 + num3;
			total = sum1 + total1;
			System.out.println(total);

			// sum = quo +sum;

		}

	}

}
