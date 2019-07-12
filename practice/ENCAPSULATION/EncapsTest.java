// example for encapsulation
class EncapsulationDemo{
    private int empid;
    private String empName;
    private int empAge;

    //getter and setter methods in the class to set and get the values of the fields.
    public int getEmpid(){
        return empid;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpid(int newValue){
        empid = newValue;
    }
}
public class EncapsTest{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Mario");
         obj.setEmpAge(32);
         obj.setEmpid(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpid());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}