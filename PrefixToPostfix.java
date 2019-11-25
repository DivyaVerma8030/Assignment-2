import java.util.Scanner;
import java.util.Stack;

public class PrefixToPostfix {
	
	public static int Precedance(char ch)
	{
		if(ch=='-')
			return 1;
		else if(ch=='+')
			return 2;
		else if(ch=='*')
			return 3;
		else
			return 4;
	}
	public static void PreToPost(String str)
	{
		Stack<String> s=new Stack<>();
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)=='+' ||str.charAt(i)=='-' ||str.charAt(i)=='*' ||str.charAt(i)=='/')
			{
				String s1=s.pop();
				String s2=s.pop();
				String s3=s1+s2+str.charAt(i);
				s.push(s3);
			}
			else
				s.push(Character.toString(str.charAt(i)));
		}
		System.out.println("Postfix Expression is:-");
		for(String str1:s)
			System.out.print(str1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PrefixToPostfix obj=new PrefixToPostfix();
		System.out.println("Enter a prefix expression:-");
		String pre=sc.next();
		obj.PreToPost(pre);
	}

}
