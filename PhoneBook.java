import java.util.Scanner;

public class PhoneBook {
	String name;
	int phone;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of enteries:-");
		int n=sc.nextInt();
		PhoneBook pb[]=new PhoneBook[n];
		System.out.println("Enter the enteries in the phone book:-");
		for(int i=0;i<n;i++)
		{
			pb[i]=new PhoneBook();
			pb[i].name=sc.next();
			pb[i].phone=sc.nextInt();
		}
		System.out.println("Enter names:-");
		for(int i=0;i<n;i++)
		{
			String val=sc.next();
			for(int j=0;j<n;j++)
			{
				if(pb[j].name.equals(val))
					System.out.println(pb[j].name+"="+pb[j].phone);
				else
					System.out.println("No such name");
			}
		}
	}

}
