package String;

public class ReverseEvenwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="I am a software tester"; 
		String[] split=test.split(" ");
		//StringBuffer rev=new StringBuffer();  
		for(int i=0;i<split.length;i++)
		{
			if(i%2!=0)
			{
				String word= split[i];
				StringBuffer rev1=new StringBuffer(word);  
				rev1.reverse();
				String rev3= rev1.toString();
						
				
				System.out.println(rev3);
			}
		}
		
	}

}
