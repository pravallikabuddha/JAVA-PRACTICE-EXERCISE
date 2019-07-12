//program to display the frequency of characters in a string;
import java.util.Scanner;
class stringfreq{
	public static void main(String args[])
	{   
		//taking input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		 String str= sc.nextLine();
		 //coverting string to char array
		  char string[]=str.toCharArray();

		 //creating an array to store the freq of each character
         int[] freq=new int[str.length()];
		 int i,j;
		// logic to count the occurence of an element
		 for(i=0;i<str.length();i++){
		 	freq[i]=1;
		 	for(j=i+1;j<str.length();j++){
		 		if(string[i]==string[j]){
		 			freq[i]++;
		 			string[j]='0';
		 		}

		 	}

		 }
		  //  displays the freq of each element 
		 for(i=0;i<str.length();i++){
		 	if(string[i]!='0')  
		 	System.out.println(string[i] + "=" +freq[i]);
		 }
		

		
	}
}
