import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
 String s1=sc.nextLine();
 s1=s1.toLowerCase();
 char a[]=s1.toCharArray();
 int b[]=new int [26];
 for(char c:a)
 {
	 if(Character.isLowerCase(c))
		 b[c-97]++;
 }
 for(int i=0;i<26;i++)
 {
	 if(b[i]==0)
	 {
		 System.out.println("not panagram");
		 System.exit(0);
	 }
 }
 System.out.println("panagram");
	}

}
