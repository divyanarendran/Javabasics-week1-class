package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "feeling good";
		char[] ch = test.toCharArray();
		int len = test.length();
		
		
		for (int i = len-1; i>=0; i--)
		{
			System.out.println(ch[i]);
		}
		
		
	}

}
