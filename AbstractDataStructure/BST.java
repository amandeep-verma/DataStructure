package abstractDataType;


public class BST<Key extends Comparable<Key>, Value> {
	
    Node root;

    BST() {
        root = null;
    }

    private class Node {
        private Key key;
        private Value value;
        private Node left;
        private Node right;

        Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }


    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    public Node put(Node present, Key key, Value value) {
        if (present == null)
            return new Node(key, value);
        if (present.key.compareTo(key) < 0)
            present.left = put(present.left, key, value);
        else if (present.key.compareTo(key) > 0)
            present.right = put(present.right, key, value);
        else
            present.value = value;
        return present;
    }


    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node present, Key key) {
        if (present == null)
            return null;
        if (present.key.compareTo(key) < 0)
            return get(present.left, key);
        else if (present.key.compareTo(key) > 0)
            return get(present.right, key);
        else
            return present.value;
    }

    public Iterable<Key> keys() {
    	QueueUsingLinkedList<Key> queue = new QueueUsingLinkedList<Key>();
        inorder(root, queue);
        return queue;
    }

    private void inorder(Node present, QueueUsingLinkedList<Key> queue) {
        if (present == null)
            return;
        inorder(present.left, queue);
        queue.enqueue(present.key);
        inorder(present.right, queue);
    }

	public static void main(String[] args) {
		


	}

}
