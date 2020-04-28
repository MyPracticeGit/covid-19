/* ********************* TECH-RANCH *************************/
/* ********  PROJECT NAME : Decimal - Binary Converter ******/
/* ***************  AUTHOR : ANJALI SINGH  ******************/
/* ***************  Dated : AUGUST 18, 2019, Sunday *********/
import java.util.*;
class DecimaltoBinaryConversion  
{ 
    // function to convert decimal to binary 
    static void decToBinary(int n) 
    { 
        // array to store binary number 
        int[] binaryNum = new int[1000]; 
   
        // counter for binary array 
        int i = 0; 
        while (n > 0)  
        { 
            // storing remainder in binary array 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
   
        // printing binary array in reverse order 
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]); 
    } 
    static int binaryToDecimal(int n) 
    { 
        int num = n; 
        int dec_value = 0; 
        // Initializing base 
        // value to 1, i.e 2^0 
        int base = 1; 
        int temp = num; 
        while (temp > 0) { 
            int last_digit = temp % 10; 
            temp = temp / 10; 
            dec_value += last_digit * base; 
            base = base * 2; 
        } 
        return dec_value; 
    } 
    // driver program 
    public static void main (String[] args)  
    {
    	@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
    	System.out.println("Enter decimal number:");
    	int n = in.nextInt(); 
    	System.out.println("Binary number of "+n +" is");
    	decToBinary(n);       
    	System.out.println("\nEnter Binary Number: ");
    	int num = in.nextInt();
    	System.out.println("Decimal number of "+num +" is "+ binaryToDecimal(num));
        System.out.println("\nPresented By Tech-Ranch");
    } 
}
/* *****************COPY RIGHT - TECH-RANCH @ 2019***********/
/* ******************** LET's MAKE CODING FUN ! *************/
/* **********************************************************/
  