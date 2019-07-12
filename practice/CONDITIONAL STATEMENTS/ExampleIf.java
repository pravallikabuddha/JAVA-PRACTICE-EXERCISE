//program to check whether person is eligible to vote or not using "IF"
package practice;

import java.util.Scanner;

public class ExampleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the age");// taking input from user
		age = sc.nextInt();
		if(age>=18)
			System.out.println("the person is eligible to vote");
		else
			System.out.println("the person is not eligible to vote");
	}

}
