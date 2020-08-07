package abstractDataType;
//Stack implementation using Doubly Linked List
//Fully functioning


public class DoublyLinkedList<Item> {
	Node first;
	int N=0;
	
	private class Node{
		private Item item;
		private Node previous;
		private Node next;
	}
	
	public void push(Item item)
	{
		Node second = first;
		first = new Node();
		first.item = item;
		first.next = second;
		first.previous=null;
		
		if(second != null)
			second.previous = first;
		N++;
	}
	
	public Item pop()
	{
		
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	
	public int size()
	{
		return N;
	}
	
//	prints elements from front to end using item.next and then printing from end to front using item.previous
//	This is just a test function to see if next and previous nodes point in right way
	public void printelements()
	{
		Node current= first;
		System.out.println(current.item);
		
		for ( int i = 0; i<N-1; i++)
		{
			current= current.next;
			System.out.println(current.item);
		}
		
		for ( int i = 0; i<N-1; i++)
		{
			current= current.previous;
			System.out.println(current.item);
			
		}
	}

	public static void main(String[] args) {

		DoublyLinkedList<Integer> st = new DoublyLinkedList<Integer>();

		for (int i =0; i <15;i++)
		{
			st.push(i);
		}
		
		
//		ITERATE THROUGH YOUR DOUBLY LINKED LIST
		st.printelements();
		
		System.out.println("elements while popping out");
		for (int i =0; i <15;i++)
		{
			System.out.println(st.pop());
		}
	}
}
