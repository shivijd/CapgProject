import java.util.Scanner;

public class StartS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1[]=s.split(",");
		int s2=s1.length;
		for(int i=0;i<s2;i++)
		{
			if(s1[i].charAt(0)=='s'||s1[i].charAt(0)=='S')
			{
				System.out.println(s1[i]);
			}
		}
		sc.close();

	}

}
