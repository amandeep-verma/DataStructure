package abstractDataType;

import java.util.Random;

public class LinkedListy<Item> {
	
	private Node first;
	private int N;
	
	LinkedListy() {
		first = null;
		N = 0;
	}

	
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
	
	public int findMid()
	{
		int midPoint = (int) Math.ceil(1.0*size()/2);
		return midPoint;
	}
	
	
	public void breakToForm(LinkedListy st, int mid)
	{
		Node present = st.first;
		for(int i =1; i< mid ; i++)
		{
			present = present.next;
		}
		first = present.next;
		present.next=null;

	}
	
	public void reverse()
	{
		Node present = first;
		
		for(int i =1; i< findMid() ; i++)
		{
			present = present.next;
		}
		
		// pointing a newStart node to remaining half
		Node newStart = present.next;
		// setting the next of mid to null
		present.next=null;
		
		// another temp node pointing on head of remaining half to store the reverse
		Node reverseholder= null;
		
		Node temp;
		while(newStart != null)
		{
			temp = newStart;
			newStart = newStart.next;
			temp.next = reverseholder;
			reverseholder = temp;
		}
		
		present.next = reverseholder;
		
	}
	
	
	private void reaarage(Item zero,Item one)
	{
		
		Node zeroBeginner = first;
		Node current = first;
		
		
		
		if (current.item==zero  )
		{
			current = current.next;
		}
		
		
		while (current.next != null) {
			
			if (current.next.item==zero  )
			{
				Node newZero = current.next;
				current.next= current.next.next;
				newZero.next = zeroBeginner;
				zeroBeginner = newZero;
				first = newZero;
			}
			else
			{
				current = current.next;
			}
			
		}

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListy<Integer> st1 = new LinkedListy<Integer>();

		System.out.println("pushing elements in the stack");
		for (int i = 1; i < 17; i++) {
			st1.push(i);
		}
		
		System.out.println("printing elements of the stack1 before breaking it");
		System.out.println(st1);
		
		System.out.println("Size of the linked list is "+st1.size());
		
		System.out.println("mid point is "+st1.findMid());
		
		st1.reverse();
		System.out.println("after reversing");
		System.out.println(st1);
		
		
		System.out.println("------------");
		
		
		Random rand = new Random();
		LinkedListy<Integer> st2 = new LinkedListy<Integer>();
		for (int i = 1; i < 17; i++) {
			st2.push(Math.abs(rand.nextInt()%3));
		}
		
		System.out.println(st2);
		
		st2.reaarage(0,1);
		System.out.println(st2);
	}

}
