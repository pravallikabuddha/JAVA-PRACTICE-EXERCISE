// simple example when default constructor  is mentioned
import java.util.Scanner;
public class constructor {
   // instance variable
	String name;
	
   //default Constructor
   constructor(){
    //name = "enjoying java programming";
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    name=sc.nextLine();
    System.out.println("the string in constructor is : wow");

   }

   public static void main(String[] args) {
      constructor obj = new constructor();
      System.out.println("the string you entered :" + obj.name);// by using object we are getting the string from constructor
     
   }
}