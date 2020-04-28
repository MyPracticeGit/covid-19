package myapp;
import java.util.*;

public class PrimeNumber {

	void prime(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = in.nextInt();
		int i, m=0, flag=0;
		m=n/2;
		if(n==0 || n==1){
			System.out.println(n+" is not Prime Number");
		}else
		{
			for(i=2;i<=m;i++){
				if(n%i == 0){
					System.out.println(n+" is not Prime Number");
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println(n+" is a Prime Number");
				
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PrimeNumber p = new PrimeNumber();
p.prime();
	}

}
