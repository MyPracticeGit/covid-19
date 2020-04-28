/* ********************* TECH-RANCH *************************/
/* ***************  PROJECT NAME : FIBONACCI ****************/
/* ***************  AUTHOR : ANJALI SINGH  ******************/
/* ***************  Dated : AUGUST 18, 2019, Sunday *********/
import java.util.Scanner;
public class FibonicciDemo{
	public void Fibonicci(){
		int a=0,b=1,c,i;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter limit: ");
		int count = in.nextInt();
		System.out.print(a+" "+b+" ");
		for(i=2;i<count;++i)
		{
			c=a+b;
			System.out.print(" "+c+" ");
			a=b;
			b=c;
		}
	}
	public static void main(String args[]){
		FibonicciDemo fib = new FibonicciDemo();
		fib.Fibonicci();
		System.out.println("\nPresented by Tech-Ranch");
	}
}
/* *****************COPY RIGHT - TECH-RANCH @ 2019***********/
/* ******************** LET's MAKE CODING FUN ! *************/
/* **********************************************************/