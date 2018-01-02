package resources;

public class Node<E> {

	private String head;
	private Node<E> next;
	private int index;
	
	public Node(String head, Node<E> next) {
		this.head = head;
		this.next = next;
		index = 0;
	}
	
	public Node(String head) {
		this.head = head;
		this.next = null;
	}
	
	public Node() {
		this.head = null;
		this.next = null;
	}
	
	void add(String head) {
		this.next = new Node<E>(this.head);
		this.head = head;
		index++;
	}
	
	public String toString() {
		return head;
	}
	
	public String get(int tempIndex) {
		//Supposed to navigate linked list by index number and return value, need to plan out more
		for (int i = 0; i <= index; i++) {
			if (this.index == tempIndex) {
				return this.head;
			}
		}
		
		return null;
	}
}
