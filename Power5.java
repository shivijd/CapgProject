import java.util.Scanner;

public class Power5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		if(n%10==5)
		{
		while(n>=5)
		{
			i=n%5;		
			n=n/5;
		}
	System.out.println(i);
		}
			
		if (i==0)
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
		System.exit(0);
		sc.close();
	}
		}
	

	

