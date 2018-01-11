
public class LinkedListEmployee {

	private EmployeeNode head;
	private int size;
	
	public void addToFront ( Employee employee ) {
		EmployeeNode node = new EmployeeNode(employee);
		// for the new node set the next as the previous head
		node.setNext(head);
		// set the new node as the head of the LL
		head = node;
		size++;
	}
	
	public EmployeeNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}
		EmployeeNode remove =  head;
		// replace the head with next node
		head = head.getNext();
		// adjust the size 
		size--;
		// remove all the reference from node removed 
		remove.setNext(null);
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
		EmployeeNode current = head ;
		while ( current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		
		// Create 4 employees 
		Employee mira  = new Employee("Mira","Bai",12345);
		Employee krish = new Employee("Krish","Kanhaiya",456);
		Employee raghu = new Employee("Raghu","Ragav",890);
		Employee ravan  = new Employee("Raja","Ravan",420);
		
		LinkedListEmployee employeeList =  new LinkedListEmployee();
		
		// check of the LL is empty before adding 
		System.out.println("is Empty - >"+ employeeList.isEmpty());
		
		employeeList.addToFront(mira);
		employeeList.addToFront(krish);
		employeeList.addToFront(raghu);
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
		
					
	}
}
