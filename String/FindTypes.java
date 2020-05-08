package String;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "WElcome to 1@";
		//String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] ch = test.toCharArray();
		int len = test.length();
		
		for (int i = 0; i < len; i++)
		
		{
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				num++;

			} else if (Character.isSpaceChar(ch[i])) {
				specialChar++;
			} else {
				space++;
			}

		}
		System.out.println(letter);
		System.out.println(num);
		System.out.println(specialChar);
		System.out.println(space);

	}
}
