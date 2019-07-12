// simple example when no default constructor is mentioned
public class constructor1 {
   // instance variables
	String name;
   int i;
   float f;
   double d;

   // no default Constructor1()
   public static void main(String[] args) {
     constructor1 obj = new constructor1();
      System.out.println(obj.name);
       System.out.println(obj.i);
        System.out.println(obj.f);
         System.out.println(obj.d);
   
   
   
   }
}