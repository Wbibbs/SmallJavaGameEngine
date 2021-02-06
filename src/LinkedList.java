
public class LinkedList<E> {

	private Node<E> curr;
	private Node<E> next;
	private int size = 0;
	
	public LinkedList(E a) {
		curr.setHead(a);;
		next = null;
	}
	
	public LinkedList() {
		curr = null;
		next = null;
	}

	public void add(E a) {
		size++;
		curr.setNext((E) new Node());
		curr.setHead(a);
		//Is supposed to set the first item in the list to point to next via tail, then makes a new object in next
		
	}
	public int size() {
		return size;
	}
}
