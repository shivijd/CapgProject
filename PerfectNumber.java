import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int i,s=1;                  
for(int j=2;j<=100;j++)

{
   s=1;
    for(i=2;i<j;i++)

    {     if(j%i==0)
        s=s+i;
    }

if(j==s)
        System.out.print(j+" ");
}
sc.close();
	}
}

