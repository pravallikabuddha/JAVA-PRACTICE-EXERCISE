// program on Nestedif conditional statement
import java.util.Scanner;
class examplenestedif{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter three numbers");
	  int a=sc.nextInt();
	  int b=sc.nextInt(); 
	  int c=sc.nextInt();
	  
	  if(a>b)
	  {
	  	if(a>c)
	  		System.out.println(a + " is large among three numbers");
	  	else
	  		System.out.println(c + " is large among three numbers");
	  }
	   else if(b>c)
	  	System.out.println(b + " is large among three numbers");
	  else
	  	System.out.println(c + " is large among three numbers");



           
	}
	  	
	   
	  
  }
	  	 



