import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchTree {
	ArrayList<Integer>  nodelist =new ArrayList<>();
	private static Node newNode(int n) {
		Node temp=new Node();
		temp.left= null;
		temp.data=n;
		temp.right= null;
		return temp;
	}
	private void insert(Node root, Node nn) {
		if(nn.data<root.data) {
			if (root.left==null) {
				root.left=nn;
			}
			else {
				insert(root.left,nn);
			}
		}
		else {
			if (root.right==null) {
				root.right=nn;
			}
			else {
				insert(root.right,nn);
			}
		}
	}
	private void traverse(Node root) {
		if(root!=null) {
			traverse(root.left);
			nodelist.add(root.data);
			traverse(root.right);
		}
		
	}
	public static void main(String[] args) {
		BinarySearchTree bst =new BinarySearchTree();
		Node root=null;
		Node nn=null;
		Scanner sc =new Scanner(System.in);
		System.out.println(" enter number of nodes you want to insert");
		int N=sc.nextInt();
		System.out.println(" enter nodes you want to insert");
		for (int i=1;i<=N;i++) {
		int n=sc.nextInt();
		nn=newNode(n);
		if (root == null) {
			root=nn;
		}
		else {
			bst.insert(root,nn);
		}
		}
		bst.traverse(root);
		System.out.println(bst.nodelist);
		System.out.println("enter the valu of sum");
		int sum= sc.nextInt();
		int flag=0;
		for(int i=0;i<bst.nodelist.size();i++) {
			int N1=bst.nodelist.get(i);
			int N2= sum-N1;
			if(bst.nodelist.contains(N2)) {
			System.out.println("pair found");
			System.out.println("(" + N1 + " ,"+ N2 + ")");
			flag=1;
			break;
			}
			}
		if (flag==0) {
			System.out.println("pair not found for the sum"+"="+ sum);
		}
	}
}