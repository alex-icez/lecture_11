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
	
	void add(T value) {
		Node node = new Node(value);
		if (root == null) {
			root = node;
			return;
			
		}
		
		
		
	}
}



public class Sample1 {

	public static void main(String[] args) {
		
	}

}
