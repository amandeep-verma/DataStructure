package abstractDataType;

//Queue implementation Generic using Linked List
public class QueueUsingLinkedList<Item> {
	private Node first;
	private Node last;
	private int N;

	QueueUsingLinkedList() {
		first = null;
		last = null;
		N = 0;
	}

	private class Node {
		private Item item;
		private Node next;
	}

	public void enqueue(Item item) {
		
		
		Node newLast = new Node();
		newLast.item = item;
		newLast.next = null;
		if(isEmpty())
			first = newLast;
		else
			last.next = newLast;
		last = newLast;
		N++;
	}

	public Item dequeue() {
		if (!isEmpty()) {
			Item item = first.item;
			first = first.next;
			N--;
			return item;
		} else
			throw new NullPointerException("Stack is Empty");
	}

	public int size() {
		return N;
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		Node current = first;
		while (current != null) {
			s.append(current.item);
			s.append(' ');
			current = current.next;
		}
		return s.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueUsingLinkedList<Integer> st = new QueueUsingLinkedList<Integer>();

		System.out.println("enqueueing elements in the stack");
		for (int i = 0; i < 15; i++) {
			st.enqueue(i);
		}

		System.out.println("printing elements of the stack");
		System.out.println(st);

		System.out.println("dequeueping elements out of the stack");
		for (int i = 0; i < 15; i++) {
			System.out.println("size= " + st.size() + " element= " + st.dequeue());
		}

	}

}