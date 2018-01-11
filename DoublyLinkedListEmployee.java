
public class DoublyLinkedListEmployee {

	private EmployeeNodeDLL head;
	private EmployeeNodeDLL tail;	
	private int size;
	
	   public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

	        // return true if you were able to successfully add the employee
	        // into the list before the existing employee. Return false
	        // if the existing employee doesn't exist in the list

	        if (head == null) {
	            return false;
	        }

	        // find the existing employee
	        EmployeeNodeDLL current = head;
	        while (current != null && !current.getEmployee().equals(existingEmployee)) {
	            current = current.getNext();
	        }

	        if (current == null) {
	            return false;
	        }

	        EmployeeNodeDLL newNode = new EmployeeNodeDLL(newEmployee);
	        newNode.setPrevious(current.getPrevious());
	        newNode.setNext(current);
	        current.setPrevious(newNode);

	        if (head == current) {
	            head = newNode;
	        }
	        else {
	            newNode.getPrevious().setNext(newNode);
	        }

	        size++;

	        return true;
	    }
	
	public void addToFront ( Employee employee ) {
		EmployeeNodeDLL node = new EmployeeNodeDLL(employee);
		// for the new node set the next as the previous head
		node.setNext(head);
		
		//set previous for the existing head
		if ( head != null) {
			head.setPrevious(node);
		} else {
			tail= node;
		}
		// set the new node as the head of the LL
		head = node;
		size++;
	}
	
	public void addToEnd ( Employee employee ) {
		EmployeeNodeDLL node = new EmployeeNodeDLL(employee);
		// for the new node set the next as the previous head
		node.setPrevious(tail);
		
		//set previous for the existing head
		if ( tail != null) {
			tail.setNext(node);
		} else {
			head= node;
		}
		// set the new node as the head of the LL
		tail = node;
		size++;
	}
	
	public EmployeeNodeDLL removeFromFront() {
		if (isEmpty()) {
			return null;
		}
		EmployeeNodeDLL remove =  head;
		
		// check if it is the only one node
		if ( head.getNext() == null) {
			tail = null;
		} else {
			// remove the reference to the previous
			head.getNext().setPrevious(null);
		}
		// replace the head with next node
		head = head.getNext();

		// adjust the size 
		size--;
		// remove all the reference from node removed 
		remove.setNext(null);
		return remove;
	}
	
	public EmployeeNodeDLL removeFromEnd() {
		if (isEmpty()) {
			return null;
		}
		EmployeeNodeDLL remove =  tail;
		
		//check if only one node exists
		if ( tail.getPrevious() == null ) {
			head = null ;
		} else {
			// remove the reference to the previous
			tail.getPrevious().setNext(null);			
		}
		// replace the tail with previous node
		tail = tail.getPrevious();

		// adjust the size 
		size--;
		// remove all the reference from node removed 
		remove.setPrevious(null);
		return remove;
	}
	
	public boolean isEmpty() {
		// LL is empty if the head is not pointing to null
		return head == null;
		
	}
	
	public int getSize() {
		return size;
	}
	
	public void printList() {
		System.out.print("head -> ");
		EmployeeNodeDLL current = head ;
		while ( current != null) {
			System.out.print(current);
			System.out.print(" <=> ");
			current = current.getNext();
		}
		System.out.println("null");
		
//		System.out.print("tail -> ");
//		current = tail ;
//		while ( current.getPrevious() != null) {
//			System.out.print(current);
//			System.out.print(" -> ");
//			current = current.getPrevious();
//		}
//		System.out.println(current);
	}
	
	public static void main(String[] args) {
		
		// Create 4 employees 
		Employee mira  = new Employee("Mira","Bai",12345);
		Employee krish = new Employee("Krish","Kanhaiya",456);
		Employee raghu = new Employee("Raghu","Ragav",890);
		Employee ravan  = new Employee("Raja","Ravan",420);
		
		DoublyLinkedListEmployee employeeList =  new DoublyLinkedListEmployee();
		
		// check of the LL is empty before adding 
		System.out.println("is Empty - >"+ employeeList.isEmpty());
		
		employeeList.addToEnd(mira);
		// print the list 
		employeeList.printList();
		
		//print the size 
		System.out.println("Size -> "+employeeList.getSize());
		
		employeeList.removeFromEnd();
		// print the list 
		employeeList.printList();
		
		//print the size 
		System.out.println("Size -> "+employeeList.getSize());		
		employeeList.addToFront(krish);
		employeeList.addToEnd(raghu);
		employeeList.addToFront(ravan);
		
		// print the list 
		employeeList.printList();
		
		//print the size 
		System.out.println("Size -> "+employeeList.getSize());
		
		//remove node from front 
		employeeList.removeFromFront();
		
		// print the list 
		employeeList.printList();
		
		//print the size 
		System.out.println("Size -> "+employeeList.getSize());

		//remove node from front 
		employeeList.removeFromEnd();
		
		// print the list 
		employeeList.printList();
		
		//print the size 
		System.out.println("Size -> "+employeeList.getSize());		
			
		
		employeeList.addToEnd(raghu);
	
		
		// print the list 
		employeeList.printList();
		
		//print the size 
		System.out.println("Size -> "+employeeList.getSize());
		
		//add before
		System.out.println(employeeList.addBefore(ravan,krish));
		System.out.println(employeeList.addBefore(mira,krish));
		
		// print the list 
		employeeList.printList();
		
		//print the size 
		System.out.println("Size -> "+employeeList.getSize());
	}
}
