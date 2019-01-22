import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=50 && a<60)
		{
			System.out.println("Pass");
		}
		if(a>=60 && a<=74)
		{
System.out.println("First Class");
		}
		if(a>=75)
		{
			System.out.println("Distinction");
		}
		else if(a<50)
		{
			System.out.println("Fail");
	}

}
}
