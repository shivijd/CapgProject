import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
char [] s1A=s1.toCharArray();
char [] s1B=s2.toCharArray();
Arrays.sort(s1A);
Arrays.sort(s1B);
if(s1.length()!=s2.length())
	System.out.println("not anagram");

if(Arrays.equals(s1A, s1B))
{
	System.out.println("strings are anagram");
}
sc.close();


}
}