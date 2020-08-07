package abstractDataType;
// Queue Implementation using arrays
// here is a catch since in a queue the element from front is dequeued so in the
// implementation we see the front being incremented but with this when the element
// has been removed it takes away the space with itself(MAJOR BUG), which can be eliminated by 
// adding another function which checks on if rear == capacity and front > 0, then whole array
// have to be copied to another array where elements from index front to rear are added into it

// Also this implementation takes the size from user which again can be set as another default
// variable in the class and can be changed with a function with growing number of enqueue
// and dequeue operations, like the comments in stackimplementation.java says.

class Queue {
	private int[] st;
	private int capacity;
	private int front,rear;
	

	Queue(int capacity) {
		this.capacity = capacity;
		front = rear = 0;
		st = new int[this.capacity];
	}

	public boolean isFull() {
		return rear == capacity;
	}

	public boolean isEmpty() {
		return rear-front == 0;
	}

	public void enqueue(int element) {
		if (!isFull()) {
			st[rear++] = element;
		} else {
			System.out.println("Queue is full");
		}
	}

	public int size() {
		return rear-front;
	}

	public int dequeue() {
		if (rear-front != 0) {
			return st[front++];
		} else {
			System.out.println("Queue is empty, cant dequeue anything out");
			return -1;
		}
	}

	public void printQueue() {
		System.out.print("[");
		for (int i = front; i < rear; i++) {
			System.out.print((i == rear - 1) ? st[i] : st[i] + ", ");
		}
		System.out.println("]");

	}

}

public class QueueImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q1= new Queue(5);
		q1.enqueue(5);
		q1.enqueue(6);
		q1.enqueue(7);
		q1.enqueue(8);
		q1.enqueue(9);
		q1.printQueue();
		System.out.println(q1.dequeue());
		q1.printQueue();
		q1.enqueue(5);

	}

}
