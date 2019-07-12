// example for overloading-static polymorphism-compile time polymorphism( same name  different signature)
class sample1
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
class DisplayOverloading
{
   public static void main(String args[])
   {
       sample1 obj = new sample1();
       obj.disp('a');
       obj.disp('a',10);
   }
}