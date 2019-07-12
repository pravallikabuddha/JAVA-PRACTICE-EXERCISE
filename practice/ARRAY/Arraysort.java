//program to display the elements in an array in an sorted order
import java.util.Scanner;
class Arraysort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        
         //taking length of an array from user
		System.out.println("enter the length of an array");
        int length=sc.nextInt();
		
		//array initialization
		int[] a=new int[length]; 
		// taking array elements as input from user      
		for(int i=0;i<length;i++){  
		System.out.println("enter the array element " +(i+1)); 
			a[i]=sc.nextInt();
		}
		System.out.println("the array before sorting is ");
		for(int i=0;i<length;i++){
			System.out.println(a[i]);
		}
		//logic to sort array elements in an ascending order
        for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			    
				}
			}
		}
		// displaying the sorted array
		System.out.println("the array after sorting is");
		for(int i=0;i<length;i++){
			System.out.println(a[i]);
		}
	}
}


