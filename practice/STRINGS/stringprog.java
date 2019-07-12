//program on strings and different methods of strings
class stringprog{
	public static void main(String args[])
	{
		// string initialization and declaration
		String s="prolifics";
		String s1=new String("hai");
	    s1.concat("welcome");

	     System.out.println(s);
	     System.out.println(s1);
	    //different methods in strings
	     System.out.println(s.concat("hello"));
	     System.out.println(s1.concat("hello"));
	     System.out.println(s.toUpperCase());
	    System.out.println(s.toLowerCase());
	    System.out.println(s.length());
	    System.out.println(s.charAt(2));
	    System.out.println(s.substring(0,3));
	    System.out.println(s.substring(1));
	     System.out.println(s.replace('r','a'));
	     System.out.println(s.startsWith("p"));
	    System.out.println(s.endsWith("i"));
	    System.out.println(s.lastIndexOf('l'));

	   
    }
	
	
    
}