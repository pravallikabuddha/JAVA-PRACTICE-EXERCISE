//Program to do different arithmetic operations using "SWITCH" case
package practice;
import java.util.*;
public class ExampleSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		char operator;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a and b values");
		
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("enter the operator + or - or * /");
		operator=sc.next().charAt(0);
		switch(operator)
		{
		case '+':
		{
			c=a+b;
			System.out.println("The added result is " + c);
			break;	
		}
		case '-':
		{
			c=a-b;
			System.out.println("The subracted result is " + c);
			break;
		}
		case '*':
		{
			c=a*b;
			System.out.println("The multiplication result is " + c);
			break;
		}
		case '/':
		{
			c=a/b;
			System.out.println("The division result is " + c);
			break;
		}
		default:
		{
			System.out.println("invalid operator");
			break;
		}
		}
		
	}

}
