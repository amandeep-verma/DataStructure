package abstractDataType;
// Implementation of generic Stack DataType using arrays
// here capacity is specified by the user at the time of creating an object, 
// programmer can add extra variable as default size and a function which can increase-
// decrease the capacity of stack with growing number of pushes and pops
public class StackG<Item> {

	private Item[] it;
	private int capacity;
	private int end;

	@SuppressWarnings("unchecked")
	StackG(int capacity) {
		this.capacity = capacity;
		it = (Item[]) new Object[this.capacity];
	}

	public boolean isFull() {
		return end == capacity;
	}

	public boolean isEmpty() {
		return end == 0;
	}

	public void push(Item element) {
		if (!isFull()) {
			it[end++] = element;
		} else {
			System.out.println("stack is full");
		}
	}

	public void pop() {
		if (end != 0)
			end--;
	}

	public int size() {
		return end;
	}

	public void printStack() {
		System.out.print("[");
		for (int i = 0; i < end; i++) {
			System.out.print((i == end - 1) ? it[i] : it[i] + ", ");
		}
		System.out.println("]");

	}

	public static void main(String[] args) {

		StackG<String> a = new StackG<String>(5);

		a.push("hell");
		a.push("hell");
		a.push("hell");
		a.printStack();
		a.push("hell");
		a.push("hell");
		a.pop();
		a.push("hell");
		a.printStack();

		StackG<Integer> ab = new StackG<Integer>(5);

		ab.push(5);
		ab.push(6);
		ab.printStack();
		ab.push(5);
		ab.push(6);
		ab.push(5);
		ab.pop();
		ab.push(6);
		ab.printStack();
	}

}
