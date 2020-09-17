package abstractDataType;

import java.util.LinkedList;
import java.util.Queue;


public class Tree<Item extends Comparable<Item>> {
	
	Node root;

	Tree() {
		root = null;
	}

	private class Node {
		private Item item;
		private Node leftChild;
		private Node rightChild;
		Node(Item item)
		{
			this.item = item;
		}
	}

	public void add(Item item) {

		root=add(item, root);
	}

	public Node add(Item item, Node present) {

		if (present == null)
			return new Node(item);
		
		if (item.compareTo(present.item) < 0) {
			present.leftChild= add(item, present.leftChild);
		}

		else if (item.compareTo(present.item) > 0) {
			present.rightChild=add(item, present.rightChild);
		}

		return present;
	}

	public Iterable<Item> print() {
		Queue<Item> queue = new LinkedList<Item>();
		
		Node present = root;
		print(present,queue);
		return queue;

	}

	/* returning items can be done in 2 ways 
	1. storing the items in queue and iterate through the tree in any order(inorder, preorder, postorder)
	2. implements iterable interface and do it. (gets complicated, how would you implement hasNext(), next() for tree)
	*/
	private void print(Node present, Queue<Item> queue) {

		if (present == null)
			return;
		if (present.leftChild != null) {
			print(present.leftChild,queue);
		}
		if (present != null) {
			queue.add(present.item);
		}
		if (present.rightChild != null) {
			print(present.rightChild,queue);
		}
	}


	
	public boolean find(Item item) {
		if (root == null)
			return false;
		Node present = root;
		return find(present, item);
	}

	private boolean find(Tree<Item>.Node present, Item item) {
		if (present == null)
			return false;

		if (item.compareTo(present.item) < 0)
			return find(present.leftChild, item);

		else if (item.compareTo(present.item) == 0)
			return true;

		else
			return find(present.rightChild, item);

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree<String> tree = new Tree<String>();

		// adding the elements to tree
		tree.add("50");
		tree.add("40");
		tree.add("60");
		tree.add("45");
		tree.add("32");
		tree.add("33");
		tree.add("65");

		System.out.println("printing all the elements in tree");
		System.out.println(tree.print());
		System.out.println("---------------");

		System.out.println("if tree contains 32 ??? => " + tree.find("32"));
	}


}
