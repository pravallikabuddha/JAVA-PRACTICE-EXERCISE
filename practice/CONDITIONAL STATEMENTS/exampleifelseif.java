//Program on if_elseif conditional statement
import java.util.Scanner;
class exampleifelseif{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter marks");
	  float marks=sc.nextFloat();
	  
	  if(marks<35)
	  System.out.println("you are failed");
	 
	  else if(marks<=80 && marks>=50)
	  System.out.println("you are passed the exam with" + marks + "and  grade is B");
	  
	  else if(marks<50 && marks>=35)
	  System.out.println("you are passed the exam with"  + marks + "and  grade is c");
	 
	  else
	  System.out.println("you are passed the exam with"  + marks + "and  grade is A");




	}
}