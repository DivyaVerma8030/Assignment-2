import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class LeftView {
	static Node root;
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int d)
		{
			data=d;
			left=null;
			right=null;
		}
	}
	public static void insert(int data)
	{
			root=insertItem(root,data);
	}
	public static Node insertItem(Node root,int data)
	{
		if(root==null)
		{
			Node newNode=new Node(data);
			root=newNode;
			return root;
		}
		if(data<root.data)
			root.left=insertItem(root.left,data);
		else if(data>root.data)
			root.right=insertItem(root.right,data);
		return root;
	}
	public void printLeftView() {
		if(root==null)
			return;
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		System.out.print(root.data+" ");
		q.add(null);
		while(!q.isEmpty()) {
			Node curr=q.poll();
			if(curr==null) {
				if(!q.isEmpty())
				{
					System.out.print(q.peek().data+" ");
					q.add(null);
				}
			}
			else {
				if(curr.left!=null)
					q.add(curr.left);
			    if(curr.right!=null)
			    	q.add(curr.right);
			}
		}
	}
	public static void InOrder()
	{
		InOrderTrav(root);
	}
	public static void InOrderTrav(Node temp)
	{
		if(temp!=null) {
			InOrderTrav(temp.left);
			System.out.println(temp.data);
			InOrderTrav(temp.right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LeftView bst=new LeftView();
		System.out.println("Enter no of elements in the bst:-");
		int n=sc.nextInt();
		System.out.println("Enter the elements in the tree:-");
		for(int i=0;i<n;i++)
		{
			int ele=sc.nextInt();
			bst.insert(ele);
		}
		bst.InOrder();
		System.out.println("The left view of the bst is:-");
		bst.printLeftView();
	}

}
