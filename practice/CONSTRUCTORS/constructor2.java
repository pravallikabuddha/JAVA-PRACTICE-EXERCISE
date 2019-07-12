//example for  parametrised constructor
class constructor2{
  // instance variables
  int x;
  String str;
   // parameterised constructor(passing parameters)
  constructor2(int i,String s){
    System.out.println("i love programming");
    x=i;
    str=s;
  }
  public static void main(String args[])
  {
    constructor2 obj=new constructor2(10,"java");
    System.out.println(obj.x);
     System.out.println(obj.str);

  }
}