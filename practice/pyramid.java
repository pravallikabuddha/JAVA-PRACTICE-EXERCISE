//Program to print pyramid of stars 
import java.util.Scanner;
class pyramid{
	public static void main(String args[]){
		int i,k=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row ");
		int row=sc.nextInt();
		System.out.println("the pyramid of stars is:");
	  for(i=1;i<=row;i++)
	  {

	     for(int space=1;space<=(row-i);space++)
	     {
	     
	     	System.out.print(" ");
	     }
	     while(k!=(2*i-1))
	     {
	     	System.out.print("* ");
	     	k++;
	     }
	      k=0;
	      System.out.println();
	       
         }
	     
	 
	  
	}

}