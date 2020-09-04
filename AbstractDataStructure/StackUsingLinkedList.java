package abstractDataType;

// Stack implementation Generic using Linked List


public class StackUsingLinkedList<Item> {
	private Node first;
	private int N;

	StackUsingLinkedList() {
		first = null;
		N = 0;
	}

	// Node inside
	private class Node {
		private Item item;
		private Node next;
	}

	public void push(Item item) {
		Node second = first;
		first = new Node();
		first.item = item;
		first.next = second;
		N++;
	}

	public Item pop() {
		if (!isEmpty()) {
			Item item = (Item) first.item;
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

		StackUsingLinkedList<Integer> st = new StackUsingLinkedList<Integer>();

		System.out.println("pushing elements in the stack");
		for (int i = 0; i < 15; i++) {
			st.push(i);
		}

		System.out.println("printing elements of the stack");
		System.out.println(st);

		System.out.println("popping elements out of the stack");
		for (int i = 0; i < 15; i++) {
			System.out.println("size= " + st.size() + " element= " + st.pop());
		}

	}
}
