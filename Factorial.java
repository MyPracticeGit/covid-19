/* ********************* TECH-RANCH *************************/
/* ***************  PROJECT NAME : FACTORIAL ****************/
/* ***************  AUTHOR : ANJALI SINGH  ******************/
/* ***************  Dated : AUGUST 18, 2019, Sunday *********/
import java.util.Scanner;
public class Factorial {
	void Fact(){
		int i,number, fact=1;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value: ");
		number = input.nextInt();
		for(i=1;i<=number;i++)
			fact=fact*i;
		System.out.println("Factorial of ---->"+number+" is  "+fact);
	}
	public static void main(String args[]){
		Factorial factorial = new Factorial();
		factorial.Fact();
		System.out.println("Presented by TECH-RANCH");
	}
}
/* *****************COPY RIGHT - TECH-RANCH @ 2019***********/
/* ******************** LET's MAKE CODING FUN ! *************/
/* **********************************************************/

