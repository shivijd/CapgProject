import java.util.Scanner;

public class MenuOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
  
   
   while(true)
   {
	   System.out.println("enter the inputs");
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   System.out.println("enter the choice you want to perform 1.add, 2.sub, 3.mul, 4.div");
	   int choice=sc.nextInt();
	   switch(choice)
	   {
	   case 1:System.out.println("addition of two numbers is "+" "+(a+b));
	   break;
	   case 2:System.out.println("subtraction of two numbers is"+"_"+(a-b));
	   break;
	   case 3:System.out.println("multiplication of two numbers is"+" "+(a*b));
	   break;
	   case 4:System.out.println("division of two numbers is"+" "+(a/b));
	   break;
	   default:System.out.println("wrong choice");
	   System.exit(0);
	   }
   }
	}
}
