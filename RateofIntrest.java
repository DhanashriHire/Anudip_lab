package javademo;
import java.util.Scanner;
public class RateofIntrest {

	public static void main(String[] args) {
		System.out.println("Enter your age:");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		System.out.println("Enter the gender(M or F):");
		char gender=sc.next().toUpperCase().charAt(0);
		if(age>60 && gender== 'M')
		{
			System.out.println("Rate of interest is 7%");
		}
		else if(age>60 && gender== 'F')
		{
			System.out.println("Rate of interest is 7.5%");
		}
		else if(age<60 && gender=='M')
		{
	        System.out.println("the rate of interest for male is 5%");
	    }
	    else if(age<60 && gender=='F')
	    {
	        System.out.println("the rate of interest for female is 5%");
	     }
	    else
	    {
	        System.out.println("invalid  input");
	    }


	}

}
