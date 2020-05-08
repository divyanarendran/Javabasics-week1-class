package String;

import java.io.IOException;

public class RemoveDuplicates {

	public static void main(String[] args) throws NullPointerException{
		// TODO Auto-generated method stub
		String text = "We learn java learn java";
		int count=0;
		//String s = "";
		int i ,j;
	     String[] split= text.split(" ");
	     for( i=0;i<split.length;i++)
	     {
	    	 if(split[i]!="")
	    	 {
	    	 for( j=i+1;j<split.length;j++)
	    		 
	    	 {
	    		 
	    		 if(split[i].equals(split[j])){
	    			split[j]="";
	    		 }
	    	 
	    	 }
	    	 }
	}
	    
	     for(int k=0;k<split.length;k++)
	     {
	    	 System.out.println(split[k]);
	     }
	    
	    	 }
	     }
//System.out.println(s); 
	


