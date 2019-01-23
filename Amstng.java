import java.util.Scanner;

public class Amstng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int n=1;n<=1000;n++)
		{
			int x=n;
			double c=0;
			int po=0;
			while(n>0)
			{
				po++;
				n=n/10;
			}
		n=x;
		while(n>0)
		{
			c=c+Math.pow(n%10,po);
			n=n/10;
		}
n=x;
if(x==c)
{
	System.out.println(c+" ");
}
	}
		sc.close();

}
}
