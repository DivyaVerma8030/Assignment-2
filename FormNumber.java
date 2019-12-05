import java.util.Scanner;

public class FormNumber {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public static void insert(FormNumber fn,int data)
	{
		Node newNode=new Node(data);
		//newNode.next=null;
		if(fn.head==null)
			fn.head=newNode;
		else {
			Node last=fn.head;
				while(last.next!=null)
				{
					last=last.next;
				}
				last.next=newNode;
			}
	}
	public static int formNumber(FormNumber li) {
		int num=0,pow=1;
		Node current=li.head;
		while(current!=null) {
			num=num+current.data*pow;
			pow*=10;
			current=current.next;
		}
		return num;
	}
	public static void display(FormNumber fn)
	{
		Node current=fn.head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FormNumber fn1=new FormNumber();
		FormNumber fn2=new FormNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of list:-");
		int len=sc.nextInt();
		System.out.println("Enter elements of 1st list:-");
		for(int i=0;i<len;i++)
		{
			int ele=sc.nextInt();
			fn1.insert(fn1,ele);
		}
		System.out.println("Enter elements of 2nd list:-");
		for(int i=0;i<len;i++)
		{
			int ele=sc.nextInt();
			fn2.insert(fn2,ele);
		}
		int num1=formNumber(fn1);
		int num2=formNumber(fn2);
		System.out.println(num1+" "+num2);
		FormNumber fn3=new FormNumber();
		int fnum=num1+num2;
		int rem;
		while(fnum%10!=0) {
			rem=fnum%10;
			fnum=fnum/10;
			fn3.insert(fn3,rem);
		}
		System.out.println("List formed by sum of the 2 lists:-");
		fn3.display(fn3);
	}

}
