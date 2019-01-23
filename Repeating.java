import java.util.Scanner;

public class Repeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char p[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			int f=0;
			for(int j=0;j<s1.length();j++)
			{
				if(p[i]==p[j])
				{
					f++;
				}
			}
			if(f==2)
			{
				continue;
				
			}
			System.out.println(p[i]);
		}
		sc.close();
}
}
