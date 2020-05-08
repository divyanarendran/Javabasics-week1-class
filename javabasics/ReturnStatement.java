package javabasics;

public class ReturnStatement {
	public int phoneNum()
	   {
		   return 44;
		   
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnStatement obj= new ReturnStatement();
	 int phoneNum2 = obj.phoneNum();
		System.out.println(phoneNum2);
		//System.out.println(obj.phoneNum());
 
	}

}
