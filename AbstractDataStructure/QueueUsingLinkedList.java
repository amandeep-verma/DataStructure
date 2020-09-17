package abstractDataType;

import java.util.Iterator;
import java.util.NoSuchElementException;

//Queue implementation Generic using Linked List
public class QueueUsingLinkedList<Item> implements Iterable<Item>{
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
		for (Item item : this)
            s.append(item + " ");
        return s.toString();
        
        
        // in order to do it without iterator
//		Node current = first;
//		while (current != null) {
//			s.append(current.item);
//			s.append(' ');
//			current = current.next;
//		}
//		return s.toString();
	}
	
	@Override
	public Iterator<Item> iterator() {
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Item>
	{
		private Node current = first;
		
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
		}

		public void remove() {
            throw new UnsupportedOperationException();
        }
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

		System.out.println("dequeueing elements out of the stack");
		for (int i = 0; i < 15; i++) {
			System.out.println("size= " + st.size() + " element= " + st.dequeue());
		}

	}

	

}