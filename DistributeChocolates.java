import java.util.Scanner;

public class DistributeChocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of packets:-");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter no of chocolates in the packets:-");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter no of students:-");
		int stu=sc.nextInt();
		int max=0,min=0,diff=999999;
		for(int i=0;i<n-stu+1;i++)
		{
			max=min=arr[i];
			for(int j=i;j<i+stu;j++)
			{
					if(arr[j]>max)
						max=arr[j];
					if(arr[j]<min)
						min=arr[j];
			}
			if(max-min<diff)
				diff=max-min;
		}
		System.out.println("Minimum Difference:-"+diff);
	}

}
