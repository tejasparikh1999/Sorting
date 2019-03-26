package Sorting;
import java.util.Scanner;
public class Bubblesort {


	 
	    public static void main(String[] args) { 
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("Enter the no of elements of array");
	    	int a=sc.nextInt();
	                int[] arr = new int[a];
	                 
	                System.out.println("Enter elements of array");  
	                for(int i=0; i < a; i++){  
                       arr[i]=sc.nextInt();
	                }
               
                  
               
        	        int n = arr.length;  
        	        int temp = 0;  
        	         for(int i=0; i < n; i++){  
        	                 for(int j=1; j < (n-i); j++){  
        	                          if(arr[j-1] > arr[j]){  
        	                                 //swap elements  
        	                                 temp = arr[j-1];  
        	                                 arr[j-1] = arr[j];  
        	                                 arr[j] = temp;  
        	                         }  
        	                          
        	                 }  
        	         }
	    
        	         
        	  
        	    
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  

}
	    }



}
