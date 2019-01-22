import java.util.Scanner;

public class Power2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      String b=Integer.toString(a);
      //int[] b=new int[6];
      char c[]=b.toCharArray();
      int  s2=b.length();
      if(c[0]=='1')
      {
		  for(int i=1;i<s2;i++)
		  {
			  if(c[i]!='0') {
				  System.out.println("False");
				  System.exit(0);
			  }
		  }
		  System.out.println("True");
      }
      else
    	  System.out.println("False");
	}

}
