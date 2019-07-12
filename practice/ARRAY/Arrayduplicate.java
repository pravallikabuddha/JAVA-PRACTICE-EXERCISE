
//Program to display duplicate elements in an array

import java.util.Scanner;
class Arrayduplicate{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        
         //taking length of an array from user
		System.out.println("enter the length of an array");
        int length=sc.nextInt();
		
		//array initialization
		int[] a=new int[length]; 
		// taking array elements as input from user      
		for(int i=0;i<length;i++){  
		System.out.println("enter the array element " +(i+1)); 
			a[i]=sc.nextInt();
		}
         // displaying the duplicate array elemnt
		System.out.println("the duplicate array elements are"); 
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				if(a[i]==a[j]){
			    System.out.println(a[i]);
				}

			}
			
			

		  }


	}
}