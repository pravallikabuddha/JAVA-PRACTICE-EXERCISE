//both parameterised and default constructors
class constructor3
{
  private int var;
      //default constructor
      public constructor3()
      {
             var = 10;
      }
      //parameterized constructor
      public constructor3(int num)
      {
             var = num;
      }
      //method
      public int getValue()
      {
              return var;
        
      }
      
      public static void main(String args[])
      {
              constructor3 obj = new constructor3();// goes to default constructor
              constructor3 obj2 = new constructor3(100);// goes to parameterised parameter
              System.out.println("var is: "+obj.var);
              System.out.println("var is: "+obj2.var);
              System.out.println("var is: "+obj.getValue());
              System.out.println("var is: "+obj2.getValue());

     
      }
}