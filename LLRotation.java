import java.util.Scanner;

public class LLRotation {
	static Node head;
	static Node tail;
	static class Node
	{
		int data;
		Node prev;
		Node next;
		Node(int d)
		{
			data=d;
			prev=null;
			next=null;
		}
	}
    public static void insertAtEnd(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
			{
				head=newNode;
				tail=newNode;
			}
		else {
			newNode.prev=tail;
			tail.next=newNode;
			tail=newNode;
		}
	}
    public static void Rotate(int k)
    {
    	for(int i=0;i<k;i++)
    	{
    		tail.next=head;
    		head.prev=tail;
    		tail=head;
    		head=head.next;
    		tail.next=null;
    	}
    }
    public static void display()
	{
		Node current=head;
		System.out.println("Linked List is:-");
		while(current.next!=null)
			{
				System.out.print(current.data+",");
				current=current.next;
			}
		System.out.print(current.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LLRotation li=new LLRotation();
		System.out.println("Enter number of elements in LL:-");
		int n=sc.nextInt();
		System.out.println("Enter elements of LL:-");
		for(int i=0;i<n;i++)
		{
			int ele=sc.nextInt();
			li.insertAtEnd(ele);
		}
		System.out.println("Enter number of times to rotate:-");
		int k=sc.nextInt();
		li.Rotate(k);
		li.display();
	}

}
