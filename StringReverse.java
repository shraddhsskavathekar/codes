import java.util.Scanner;
class StringReverse
{
	public static void main(String s[])
	{
		String str =new String();
		String reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		str=sc.nextLine();
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse+=str.charAt(i);	
		} 
		System.out.println(reverse);
	}
}