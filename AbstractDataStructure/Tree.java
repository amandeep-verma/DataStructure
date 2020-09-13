package abstractDataType;


public class Tree <Item extends Comparable<Item>> {
	Node root ;

	Tree()
	{
		root = null;
	}
	
	private class Node{
		private Item item;
		private Node leftChild;
		private Node rightChild;
//		private Node parent; // only if you need pointer from child to parent
	}
	
	public void add(Item item) {
		if(root == null)
		{
			root= new Node();
			root.item = item;
			return;
		}
		Node present =root;
		
		add(item, present);
	}

	
	public void add(Item item, Node present) {
		
		if (present.item == null)
		{
			present.item = item;
		}
		
		else if (((String) item).compareTo((String) present.item) < 0)
		{
			if(present.leftChild == null)
				present.leftChild = new Node();
			present = present.leftChild;
			add(item, present);
		}
		
		else if (((String) item).compareTo((String) present.item) > 0)
		{
			if(present.rightChild == null)
				present.rightChild = new Node();
			present = present.rightChild;
			add(item, present);
		}
		
	}
	
	public void print()
	{
		Node present = root;
		print(present);
		
	}	
	
	private void print(Tree<Item>.Node present) {
		
		if (present == null)
			return;
		if(present.leftChild!=null)
		{
			print(present.leftChild);
		}
		if (present != null)
		{
			System.out.println(present.item);
		}
		if (present.rightChild!=null)
		{
			print(present.rightChild);
		}
	}
	
	private boolean find(Item item)
	{
		if (root == null)
			return false;
		Node present = root;
		return find(present, item);
	}

	private boolean find(Tree<Item>.Node present,Item item)
	{
		if ( present == null)
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
		tree.print();
		System.out.println("---------------");
		
		System.out.println("if tree contains 32 "+tree.find("51"));
	}

}
