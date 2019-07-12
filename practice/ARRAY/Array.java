
//program to intialise and declaration of an array and display array elements

import java.util.Scanner;
class Array{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the length of an array");
		int length=sc.nextInt();
		//array initialization
		int[] a=new int[length]; 
		// taking input from user      
		for(int i=0;i<length;i++){  
		System.out.println("enter the array element " +(i+1)); 
			a[i]=sc.nextInt();
		}
		System.out.println("the array elements are"); 
		 // displaying the array elemnts
		for(int i=0;i<length;i++){
			System.out.print(a[i]);

		  }


	}

	
}