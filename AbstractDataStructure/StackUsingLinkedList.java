package abstractDataType;
// Stack implementation using Linked List
public class StackUsingLinkedList<Item> {
	Node first;
	int N=0;
	
	private class Node{
		private Item item;
		private Node next;
	}
	
	public void push(Item item)
	{
		Node second = first;
		first = new Node();
		first.item = item;
		first.next = second;
		N++;
	}
	
	public Item pop()
	{
		Item item = first.item;
		first = first.next;
		return item;
	}
	
	public int size()
	{
		return N;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUsingLinkedList<Integer> st = new StackUsingLinkedList<Integer> ();
		
		for (int i =0; i <15;i++)
		{
			st.push(i);
		}
		
		for (int i =0; i <15;i++)
		{
			System.out.println(st.N+" "+st.pop());
		}
	}

}
