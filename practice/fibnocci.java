// program to print fibnocci series
import java.util.Scanner;
class fibnocci{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter n value ");
	  int n=sc.nextInt();
	  int a=0,b=1,c;
	  
	  System.out.println("the fibonocci series: ");
	   System.out.print(" "  +a + " " + b );
	  
	  for(int i=1;i<=n;i++){
	  	c=a+b;
	  	a=b;
	  	b=c;
	  	
	  	
	  	System.out.print(" " + c );
	  }



           
	}
	  	
	   
	  
  }
	  	 



