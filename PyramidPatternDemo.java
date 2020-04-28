/* ********************* TECH-RANCH *************************/
/* ***************  PROJECT NAME : STAR/NUMBER PATTERN ******/
/* ***************  AUTHOR : ANJALI SINGH  ******************/
/* ***************  Dated : AUGUST 18, 2019, Sunday *********/
import java.util.Scanner;
public class PyramidPatternDemo
{
	public void StarPattern(){
		int i, space, rows, j=0;
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        rows = scan.nextInt();
        for(i=1; i<=rows; i++)
        {
            for(space=1; space<=(rows-i); space++)
            {
                System.out.print("  ");
            }
            while(j != (2*i-1))
            {
                System.out.print("* ");
                j++;
            }
            j = 0;
            System.out.println();
        }
    
	}
public void NumberPattern()
{
	int i, space, rows, j=0;
    @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
    System.out.print("Enter Number of Rows : ");
    rows = scan.nextInt();
    for(i=1; i<=rows; i++)
    {
        for(space=1; space<=(rows-i); space++)
        {
            System.out.print("  ");
        }
        while(j != (2*i-1))
        {
            System.out.print(j+" ");
            j++;
        }
        j = 0;
        System.out.println();
    }
}    public static void main(String args[])
    {
    PyramidPatternDemo pat = new PyramidPatternDemo();
    pat.NumberPattern();
    pat.StarPattern();
    }
}
/* *****************COPY RIGHT - TECH-RANCH @ 2019***********/
/* ******************** LET's MAKE CODING FUN ! *************/
/* **********************************************************/