import java.util.LinkedList;

public class LinkedListJDK {
	
	public static void printList(LinkedList<Employee> list ) {
		System.out.print("Head ->");
		for( Employee employee: list) {
			System.out.print(employee);
			System.out.println("<=>");			
		}		
	}

	public static void main(String[] args) {
		
		// Create 4 employees 
		Employee mira  = new Employee("Mira","Bai",12345);
		Employee krish = new Employee("Krish","Kanhaiya",456);
		Employee raghu = new Employee("Raghu","Ragav",890);
		Employee ravan  = new Employee("Raja","Ravan",420);
		
		LinkedList<Employee> employeeList =  new LinkedList<>();
		
		// check of the LL is empty before adding 
		System.out.println("is Empty - >"+ employeeList.isEmpty());
		
		employeeList.add(mira);
		// print the list 
		printList(employeeList);
		
		//print the size 
		System.out.println("Size -> "+employeeList.size());
		
		employeeList.remove();
		// print the list 
		printList(employeeList);
		
		//print the size 
		System.out.println("Size -> "+employeeList.size());		
		employeeList.addFirst(krish);
		employeeList.addLast(raghu);
		employeeList.addFirst(ravan);
		
		// print the list 
		printList(employeeList);
		
		//print the size 
		System.out.println("Size -> "+employeeList.size());
		
		//remove node from front 
		employeeList.removeFirst();
		
		// print the list 
		printList(employeeList);
		
		//print the size 
		System.out.println("Size -> "+employeeList.size());

		//remove node from end 
		employeeList.remove();
		
		// print the list 
		printList(employeeList);
		
		//print the size 
		System.out.println("Size -> "+employeeList.size());		
					
	}
}
