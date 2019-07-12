// program that shows method overridding-static polymorphism(same name same signature)
class ParentClass{
   //Parent class constructor
   ParentClass(){
	System.out.println("Constructor of Parent");
   }
   void disp(){
	System.out.println("Parent Method");
   }
}
class overrid extends ParentClass{
  //child class constructor
   overrid(){

	System.out.println("Constructor of Child");
   }
   void disp(){
	System.out.println("Child Method");
      
   }
   public static void main(String args[]){
	//Creating the object of child class
	overrid obj = new overrid();
	obj.disp();// goes to method in child class
   }
}