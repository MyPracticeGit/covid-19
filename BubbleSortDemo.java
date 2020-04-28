/* ********************* TECH-RANCH *************************/
/* ***************  PROJECT NAME : BUBBLE SORTING ***********/
/* ***************  AUTHOR : ANJALI SINGH  ******************/
/* ***************  Dated : AUGUST 18, 2019, Sunday *********/
/*BUBBLE SORTING USING ARRAY  PRESENTED BY TECH-RANCH *******/
import java.util.Scanner;
// CLASS DECLARATION  BUBBLESORTDEMO
public class BubbleSortDemo {  
//STATIC METHOD BUBBLESORT FOR GETTNG VALUES FROM USER & SORTING 
	static void bubbleSort() {  
// This piece of code for getting user inputs and storing in a list 
    	Scanner input = new Scanner(System.in);
        System.out.println ("how many number you want to put in the pot?");
        int num = input.nextInt();
        int arr_1[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println ("Number[" + i + "] :");
            arr_1[i] = input.nextInt();
        }
        System.out.println("Array Before Bubble Sort");
        for (int temp : arr_1){
            System.out.print (temp + "\t");
        }
        input.close();
//////////////////////////////////////////////////////////////////////////////////
// This piece of code for sorting list 
    	int n = arr_1.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr_1[j-1] > arr_1[j]){  
                                 //swap elements  
                                 temp = arr_1[j-1];  
                                 arr_1[j-1] = arr_1[j];  
                                 arr_1[j] = temp;
                                 }  
                         }  
                }
// This piece of code for displaying sorted list
         System.out.println("\nArray After Bubble Sort");  
         for(int i=0; i < arr_1.length; i++){  
                 System.out.print(arr_1[i] + "       ");  
         }  
    }
	//closing  bubbleSort() method
    public static void main(String[] args) {
    	  bubbleSort();//sorting array elements using bubble sort
    	
    	  System.out.println("\n  THE END!");
        }  
} // closing class
/* *****************COPY RIGHT - TECH-RANCH @ 2019***********/
/* ******************** LET's MAKE CODING FUN ! *************/
/* **********************************************************/