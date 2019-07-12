class inheritexample {
   int id=8;
   String name = "pravallika";
   String collegeName = "Aditya engineering college";
   void does(){
	System.out.println("student");
   }
}

public class child extends inheritexample{
   String branch = "ECE";
   public static void main(String args[]){
	child obj = new child();
	System.out.println(obj.collegeName);
	System.out.println(obj.name);
	System.out.println(obj.branch);
   System.out.println(obj.id);
	obj.does();
   }
}