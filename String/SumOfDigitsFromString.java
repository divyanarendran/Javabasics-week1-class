package String;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Tes12Le79af65";
		int sum=0;
		
		for(int i=0;i<text.length();i++) {
			char ch=text.charAt(i);
			if(Character.isDigit(ch))
			{
				int word= Character.getNumericValue(ch);
				//int word= Integer.parseInt(String.valueOf(ch));
						sum=sum+word;
			}				
			
			
		}
		System.out.println(sum);
	}

}
