package javademo;
import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		int num1,num2,choice,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		num1=sc.nextInt();
		System.out.println("Enter second number:");
		num2=sc.nextInt();
		System.out.println("1.Arithmetic operator \n2.Logical Operator \n3.Relational Operator \n4.Bitwise Operator \n5.Conditional Operator \n6.Assignment Operator");
		System.out.println("Enter your choie:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			res=num1+num2;
			System.out.println("Addition :"+res);
			res=num1-num2;
			System.out.println("substraction :"+res);
			res=num1*num2;
			System.out.println("multiplication :"+res);
			res=num1/num2;
			System.out.println("Division :"+res);
			break;
			
		case 2:
			
			System.out.println((num1>num2)&&(num1>num2));
			System.out.println((num1>num2)||(num1>num2));
			System.out.println(!(num1>num2)&&(num1>num2));
			break;
			
		case 3://relational operator
            
            System.out.println("num1>num2 " +(num1 > num2));
            System.out.println("num1<num2 "  +(num1 < num2));
            System.out.println("num1>=num2 " +(num1 >= num2));
            System.out.println("num1<=num2 " +(num1<=num2));
            System.out.println("num1!=num2 " +(num1 != num2));
            System.out.println("num1==num2 " +(num1 == num2));
            break;
            
		case 4://Bitwise operator
			 System.out.println("bitwise and operator:-"+(num1&num2));
             System.out.println("bitwise or operator:-"+(num1|num2));
             System.out.println("bitwise and operator:-"+(num1^num2));
             break;
		
		case 5:
			int result=(num1>num2)?num1:num2;
			System.out.println("The greatest number is ="+result);
             break;
        
		case 6:
			int ans;
			num2+=num1;
			System.out.println(num2);
			num2-=num1;
			System.out.println(num2);
			num2*=num1;
			System.out.println(num2);
			num2/=num1;
			System.out.println(num2);
			break;
			
		default:
			System.out.println("Invalid choice");
			
			
			
		}

	}

}
