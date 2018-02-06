
public class SingleLinkedList {
	
	// Head of the SinglyLinkedList
	protected Node head;
	// Tail of the SinglyLinkedList
    protected Node tail ;
	
    // Add an element to Singly
	public void add(int data){
        
        Node newNode = new Node();
        newNode.setData(data);
        
        // If list is empty
        if(head == null){
            //since there is only one element, both head and tail points to the same object.
            head = newNode;
            tail = newNode;
        } 
        else {
            //set current tail next link to new node
            tail.setLink(newNode);
            //set tail as newly created node
            tail = newNode;
        }
        
    }
	
	// Remove last element from SinglyLinkedList
	public void removeLast() {
	
		// if list is empty
		if (tail == null)
	        		return;
		// if there is only element in list
		else if (head == tail) {
	              head = null;
	              tail = null;
	    }
	    else {
	        		  Node previousToTail = head;
	        		  // Traversing from head to last
	              while (previousToTail.getLink() != tail)
	                   		previousToTail = previousToTail.getLink();
	
	              tail = previousToTail;
	              tail.setLink(null);
	
	        }
	        
	  }
	
		// Remove All elements from SinglyLinkedList
		public void removeAllAboveValue(int data) {
		
			// if list is empty
			if (tail == null)
		        		return;
			
			else if(head.getData() > data) {
					removeLast();
			}
			
		    else {
		        		  Node previousNode = head;
		        		  Node currentNode  = previousNode.getLink();
		        		  // Traversing from head to last
		              while (currentNode != null) {
		            	  		
		            	  		// Check condition if data is grater than Object Value
		            	  		if(currentNode.getData() > data) {
		            	  			
		            	  			previousNode.setLink(currentNode.getLink());
		            	  			currentNode = currentNode.getLink();
		            	  			
		            	  		}
		            	  		else {
		            	  				
		            	  			previousNode = currentNode;
		            	  			currentNode = currentNode.getLink();
		            	  			
		            	  		}
		            	  
		              }
		                   	
		
		        }
		        
	}
		
	// This function prints all elements of List
	public void printList() {
		
		Node temp = head;
        while(temp != null){
           
            System.out.println(temp.getData());
            temp = temp.getLink();
            
        }
		
	}

	

}
