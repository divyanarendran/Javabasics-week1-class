package javabasics;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 8;
		String flag = null;
		int half = input / 2;
		for (int i = 1; i < half; i++) {
			if (input % i == 0) {
				flag = "true";

			} else {
				flag = "false";

			}
		}
		if (flag == "false") {
			System.out.println("NotPrime");
		} else {
			System.out.println("Prime");
		}

	}

}
