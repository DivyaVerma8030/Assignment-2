import java.util.Scanner;

public class RemDuplicatesLL {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	static void addEnd(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
			head=newNode;
		else {
			Node last=head;
				while(last.next!=null)
				{
					last=last.next;
				}
				last.next=newNode;
			}
	}
	static void removeDuplicates()
	{
		Node current=head;
		Node current1;
		while(current!=null)
		{
			current1=current.next;
			while(current1!=null)
			{
				if(current.data==current1.data)
					delete(current.data);
				current1=current1.next;
			}
			current=current.next;
		}
	}
	static void delete(int data)
	{
		Node prev=head;
		while(prev.next!=null && prev.next.data!=data)
			prev=prev.next;
		prev.next=prev.next.next;
	}
	static void display() {
		Node current=head;
		while(current.next!=null) {
			System.out.print(current.data+",");
			current=current.next;
		}
		System.out.println(current.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		RemDuplicatesLL li=new RemDuplicatesLL();
		System.out.println("Enter number of elements in LL:-");
		int n=sc.nextInt();
		System.out.println("Enter elements of LL:-");
		for(int i=0;i<n;i++)
		{
			int ele=sc.nextInt();
			li.addEnd(ele);
		}
		li.removeDuplicates();
		System.out.println("After removing duplicates from the LL:-");
		li.display();
	}

}
