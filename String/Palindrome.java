package String;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="madam";
	
		StringBuffer sb=new StringBuffer(name);  
	    sb.reverse();  
	    String rev=sb.toString();
		
					if(name.equals(rev))
					{
						System.out.println(name);
					}
			//System.out.println(c[i]);
		}


}
