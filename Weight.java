import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		char b[]=s1.toCharArray();
		for(char c:b)
			count=count+(c-96);
		System.out.println("weight is"+count);
		sc.close();
		
		

	}

}
