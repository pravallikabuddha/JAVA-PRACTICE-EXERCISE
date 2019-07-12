//Program to print first n numbers using "FOR" loop
package practice;
import java.util.*;

public class ExampleFor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");
		n=sc.nextInt();
		for(i=0;i<=n;i++) {
			System.out.println("i =" + i);	
		}
	}
}
