/* ********************* TECH-RANCH *************************/
/* ***************  PROJECT NAME : PALINDROME ***************/
/* ***************  AUTHOR : ANJALI SINGH  ******************/
/* ***************  Dated : AUGUST 18, 2019, Sunday *********/
import java.util.Scanner;
    public class PalindromeDemo
    {
        public static void main(String args[])
        {
            String a, b = "";
            @SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
            System.out.print("Enter the string you want to check:");
            a = s.nextLine();
           int n = a.length();
            for(int i = n - 1; i >= 0; i--)
            {
                b = b + a.charAt(i);
            }
            if(a.equalsIgnoreCase(b))
            {
                System.out.println("The string is palindrome.");
            }
            else
            {
                System.out.println("The string is not palindrome.");
            }
        }
    }
/* *****************COPY RIGHT - TECH-RANCH @ 2019***********/
/* ******************** LET's MAKE CODING FUN ! *************/
/* **********************************************************/