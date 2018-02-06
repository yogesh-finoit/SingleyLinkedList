
public class LinkedListTest {

	public static void main(String[] args) {
		
		// Initialize SingleyLinkedList
		SingleLinkedList list = new SingleLinkedList();
		// Add test data inside the SingleLinkList
		list.add(10);
		list.add(77);
		list.add(55);
		list.add(25);
		list.add(35);
		list.add(26);
		list.add(89);
		//Print above list
		list.printList();
		//Delete last node from list
		list.removeLast();
		//Print above list
		list.printList();
		//Remove all elements of list which have value grater than 50
		list.removeAllAboveValue(50);
		//Print above list
		list.printList();
		
	}

}
