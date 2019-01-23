import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x=n;
int c=0;
sc.close();
while(n>0)
{
	c=c+findfact(n%10);
	n=n/10;
}
if(x==c)
{
	System.out.println("Strong Number");
}
else
	System.out.println("not strong number");

	}


	private static int findfact(int n) {
		// TODO Auto-generated method stub
		int f=1;
		if(n==0)
			return 1;
		while(n>0)
			f=f*n;
		n--;
		return 0;
	}

}
