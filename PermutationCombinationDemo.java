/* ********************* TECH-RANCH ********************************************/
/* ************  PROJECT NAME : Permutation & Combination Demonstration********/
/* **********  AUTHOR : ANJALI SINGH  *****************************************/
/* ***************  Dated : AUGUST 27, 2019, Tuesday*****************************/
import java.util.*;
public class PermutationCombinationDemo 
{
	static void printPermutation(String str , String ans){
		if(str.length() == 0){
			System.out.println(ans +" ");
			return;
		}
		for(int i =0; i<str.length();i++){
			char ch=str.charAt(i);
			String r = str.substring(0,i)+str.substring(i+1);
			printPermutation(r,ans+ch);
		}
	}
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = input.next();
		printPermutation(str, " ");
			}
}
/* *****************COPY RIGHT - TECH-RANCH @ 2019***********/
/* ******************** LET's MAKE CODING FUN ! *************/
/* **********************************************************/