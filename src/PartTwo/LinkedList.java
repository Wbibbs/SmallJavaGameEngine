package PartTwo;
//import List.Set;
//import List.node;

class LinkedList<E> {
	Object item;
    LinkedList<E> next;
//	private Set inputSet;
	

    @SuppressWarnings("null")
	LinkedList() 
	{
      item = (Object) null;
      next = null;
      
    }

    LinkedList(Object item) {
      this.item = item;
      next = null;
    }

    LinkedList(Object item, LinkedList<E> next) {
      this.item = item;
      this.next = next;
    }

    LinkedList(LinkedList<E> n) {
      this.item = n.item;
      this.next = n.next;
    }
    
    void addItem(LinkedList<E> a) {
    	this.item = a.item;
    	this.next = a.next;
    }

//	node(Set inputSet) 
//	{
//		this.inputSet = inputSet;
//		
//	}
}
