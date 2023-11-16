package javademo;
import java.util.*;
public class SwitchDemo {

	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Find out greater between three NO");
		System.out.println("2.Check given no is even or odd ");
		System.out.println("3.Checkk the given character is vowel or not");
		System.out.println("4.check the given no is divible by five or not");
        System.out.println("Enter the choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter a:");
			int a=sc.nextInt();
			System.out.println("Enter b:");
			int b=sc.nextInt();
			System.out.println("Enter c:");
			int c=sc.nextInt();
			if(a>b && a>c)
			{
				System.out.println("a is gratest num");
			}
			else if(b>a && b>c)
			{
				System.out.println("b is gratest num");
			}
			else
			{
				System.out.println("c is gratest num");
			}
			break;
			
		case 2:
			System.out.println("Enter the number:");
			int num =sc.nextInt();
			if(num%2==0)
			{
				System.out.println("Given num is even");
			}
			else
			{
				System.out.println("Given num is odd");
			}
			break;
			
		case 3:
			System.out.println("Enter the alphabet:");
			char ch=sc.next().charAt(0);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
			{
				System.out.println("Given alphabet is vowel");
			}
			else
			{
				System.out.println("Given alphabet is not vowel");
			}
			break;
			
		case 4:
			System.out.println("Enter the number:");
			int no =sc.nextInt();
			if(no%5==0)
			{
				System.out.println("Given num is divisible by 5");
			}
			else
			{
				System.out.println("Given num is not divisible by 5");
			}
			
		default:
			System.out.println("Invalid choice");
			}
        
	}

}
