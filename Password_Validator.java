package arrayafter;

import java.util.Scanner;
public class Password_Validator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password_Validator pv=new Password_Validator();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your password");
		String password=sc.next();
		
	boolean result=	pv.isValidPassword(password);	
		
		if(result==true)
		System.out.println("\" Your password is correct\"");
		else {
			System.err.println("Your password is incorrect!! \nPlease, Renter your password.");
			
		}
	}

	private boolean isValidPassword(String password) {
		// TODO Auto-generated method stub
		
		boolean val=true;
		
		if(password.length()>15 || password.length()<8)
		{
			System.out.println("Password must be less than 15 and more than 8 characters in length");
			val=false;
		}
		
		String upperCase="(.*[A-Z].*)";
		if(!password.matches(upperCase))
		{
			System.out.println("Password must have atleast one uppercase character");
			val=false;
		}
		
		String lowerCase="(.*[a-z].*)";
		if(!password.matches(lowerCase))
		{
			System.out.println("Password must have atleast one lowercase character");
			val=false;
		}
		String numbers="(.*[0-9].*)";
		if(!password.matches(numbers))
		{
			System.out.println("Password must have atleast one number");
			val=false;
		}
		
		String specialChars="(.*[@,#,$,%,&,*].*)";
		if(!password.matches(specialChars))
		{
			System.out.println("Password must have atleast one special character among @ # $ % & *");
			val=false;
		}
		return val;
	}

}
