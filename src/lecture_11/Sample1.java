package lecture_11;



class Tree<T extends Comparable<T>> {
	private class Node {
		T value;
		Node left;
		Node right;
		public Node(T value) {
			this.value = value;
		}
	}
	
	Node root = null;
	
	private void add(Node iter, Node node) {
		if (iter.value.compareTo(node.value) > 0)
			if (iter.left != null)
				add(iter.left, node);
			else
				iter.left = node;
		else 
			if (iter.right != null)
				add(iter.right, node);
			else
				iter.right = node;
	}
	
	void add(T value) {
		Node node = new Node(value);
		if (root == null) {
			root = node;
			return;
		}
		add(root, node);
	}
}



public class Sample1 {

	public static void main(String[] args) {
		
	}

}
