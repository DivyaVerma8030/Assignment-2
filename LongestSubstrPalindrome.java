import java.util.Scanner;

public class LongestSubstrPalindrome {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		String longest=new String();
		String substr=new String();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++) {
			substr=str.substring(i, j);
			StringBuffer sb1=new StringBuffer(substr);
			sb1.reverse();
			if(substr.equals(sb1.toString()) && substr.length()>longest.length())
				longest+=substr;
			}
				
		}
		System.out.println("Longest substring palindrome:-"+longest);
	}

}
