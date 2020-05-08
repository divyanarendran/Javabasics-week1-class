package String;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count=0;
		char[] ch=str.toCharArray();
		
		int len = str.length();
		for (int i =0;i< len; i++)
		{
			if (ch[i] == 'e')
			{
				count++;
			}
		}
		
	System.out.println(count);

	}

	
}
