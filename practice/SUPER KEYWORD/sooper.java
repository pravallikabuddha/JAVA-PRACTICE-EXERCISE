// program that shows use of  super class
class ParentClass{
   //Parent class constructor
   ParentClass(){
	System.out.println("Constructor of Parent");
   }
   void disp(){
	System.out.println("Parent Method");
   }
}
class sooper extends ParentClass{
  //child class constructor
   sooper(){

	System.out.println("Constructor of Child");
   }
   void disp(){
	System.out.println("Child Method");
 //Calling the disp() method of parent class
	super.disp(); 
   }
   public static void main(String args[]){
	//Creating the object of child class
	sooper obj = new sooper();
	obj.disp(); //goes to method in child class 
   }
}