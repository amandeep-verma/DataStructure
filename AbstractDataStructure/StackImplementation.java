package abstractDataType;
// Strawman implementations
//Should you call it stack?? It doesn't meet performance specification of stack.
//refer to StackUsingLinkedList.java

//Implementation of Stack DataType using arrays
//here capacity is specified by the user at the time of creating an object, 
//programmer can add extra variable as default size and a function which can increase-
//decrease the capacity of stack with growing number of pushes and pops



public class StackImplementation {
	
	private int[] st;
	private int end;

	StackImplementation(int maxCapacity) {
		st = new int[maxCapacity];
	}

	public boolean isFull() {
		return end == st.length;
	}

	public boolean isEmpty() {
		return end == 0;
	}

	public void push(int element) {
		if (!isFull()) {
			st[end++] = element;
		} else {
			System.out.println("stack is full");
		}
	}

	public int size() {
		return end;
	}

	public int pop() {
		if (end != 0) {
			return st[--end];
		} else {
			System.out.println("Stack is empty, cant pop anything out");
			return -1;
		}
	}

	public void printStack() {
		System.out.print("[");
		for (int i = 0; i < end; i++) {
			System.out.print((i == end - 1) ? st[i] : st[i] + ", ");
		}
		System.out.println("]");

	}

	public static void main(String[] args) {
		StackImplementation a = new StackImplementation(5);

		a.push(5);
		a.push(6);
		a.printStack();
		a.push(7);
		a.push(8);
		a.push(9);
		a.printStack();
		a.pop();
		a.push(10);
		a.printStack();

	}

}
