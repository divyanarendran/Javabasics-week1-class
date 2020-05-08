package String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "stops";
		String text2 = "potss";
		int len1=text1.length();
		int len2=text2.length();
		char[] word1=text1.toCharArray();
		char[] word2=text2.toCharArray();
		if(len1==len2)
		{
				Arrays.sort(word1);
				Arrays.sort(word2);
				for(int i =0;i<len1;i++)
				{
					if(word1[i]!=word2[i])
					{
						System.out.println("false");
					
					}
					System.out.println("True");
				}
				}
		}
	}


