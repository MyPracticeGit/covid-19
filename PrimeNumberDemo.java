/* ********************* TECH-RANCH ******************************************************/
/* ***************  PROJECT NAME : Prime Number Demonstration****************/
/* ***************  AUTHOR : ANJALI SINGH  ***********************************************/
/* ***************  Dated : AUGUST 27, 2019, Tuesday *************************************/
import java.util.Scanner;

public class PrimeNumberDemo {
 	public void primenumberusingarray(){
		  int i, s, j, p;
	        int arr[] = new int[100];
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Size of An Array :");
	        s = sc.nextInt();
	        System.out.print("\nEnter Array Elements :");
	        for (i = 0; i < s; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.print("\nAll Prime Numbers are :");
	        for (i = 0; i < s; i++) {
	            j = 2;
	            p = 1;
	            while (j < arr[i]) {
	                if (arr[i] % j == 0) {
	                    p = 0;
	                    break;
	                }
	                j++;
	            }
	            if (p == 1) {
	                System.out.print(" " + arr[i]);
	            }
	        }
	    }
	
	public void primenumberusingfor(){
		//define limit
		int limit = 100;
		System.out.println("Prime numbers between 1 and " + limit);
		//loop through the numbers one by one
		for(int i=1; i < 100; i++){
		boolean isPrime = true;
		//check to see if the number is prime
			for(int j=2; j < i ; j++){
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			// print the number 
			if(isPrime)
				System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		PrimeNumberDemo p = new PrimeNumberDemo();
		p.primenumberusingfor();
		System.out.println("After primenumberusingFor()......");
		p.primenumberusingarray();
		System.out.println("After primenumberusingArray().....");
		}
}
/* *****************COPY RIGHT - TECH-RANCH @ 2019***********/
/* ******************** LET's MAKE CODING FUN ! *************/
/* **********************************************************/