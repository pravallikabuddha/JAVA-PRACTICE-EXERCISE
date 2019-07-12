//program to check whether the given number is even or odd using IF_ELSE
package practice;
import java.util.*;

public class ExampleIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");// taking input from user
		num = sc.nextInt();
		if(num%2==0)
			System.out.println("the number is even");
		else
			System.out.println("the number is odd");
			

	}

}
