package String;

public class ChangeOddIndextoUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		StringBuffer string = new StringBuffer();
		char[] ch = test.toCharArray();
		int len = test.length();
		int i;
		for (i = 0; i < len; i++) {
			char c=ch[i];
			if(i%2 !=0)
			{
			c= Character.toUpperCase(c);
				System.out.println(c);
			}
		
		}
      
	}

}
