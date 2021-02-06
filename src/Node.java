
public class Node<E> {

	/**
	 * Declares a head and next for the node to use
	 */
	private E head;
	private Node<E> next;
	
	/**
	 * Constructor setting head and next to null
	 */
	public Node() {
		head = null;
		next = null;
	}
	
	/**
	 * Constructor setting head equal to a given value, and next to null
	 * @param head Input value that sets current Node head to input value
	 */
	public Node(E head) {
		this.head = head;
		next = null;
	}
	
	public E getHead() {
		return head;
	}
	
	public E getNext() {
		return (E) next;
	}
	
	public void setNext(E next) {
		this.next = (Node<E>) next;
	}
	
	public void setHead(E head) {
		this.head = head;
	}
}
