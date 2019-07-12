//Program to print floyd triangle
import java.util.Scanner;
class floyd{
	public static void main(String args[]){
		int num=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row ");
		int row=sc.nextInt();
		System.out.println("the floyd triangle is:");
	  for(int i=0;i<row;i++)
	  {

	     for(int j=0;j<=i;j++)
	     {
	     	System.out.print(num + " ");
	       num++;
	       
	     }
	        System.out.println();
	  }
	}

}