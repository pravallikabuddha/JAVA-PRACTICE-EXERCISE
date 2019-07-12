//Program to get the reverse of given number using "WHILE" loop 
package practice;
import java.util.*;
public class ExampleWhile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem=0,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		while(num>0) {
			rem=num%10;
			rev=rev*10;
			rev=rem+rev;
			num=num/10;
			
		}
		System.out.println("reverse of a given number is " + rev);
		
	

	}

}
