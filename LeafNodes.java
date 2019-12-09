import java.util.Scanner;

public class LeafNodes {
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
	public static void printLeafNodes() {
		display(root);
	}
	public static void display(Node root) {
		if(root==null)
			return;
		else if(root.left==null && root.right==null)
			System.out.print(root.data+" ");
		else {
			display(root.left);
			display(root.right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LeafNodes bst=new LeafNodes();
		System.out.println("Enter no of elements in the tree:-");
		int n=sc.nextInt();
		System.out.println("Enter elements of the tree:-");
		for(int i=0;i<n;i++) {
			int ele=sc.nextInt();
			bst.insert(ele);
		}
		System.out.println("Leaf Nodes of the binary tree:-");
		bst.printLeafNodes();
	}

}
