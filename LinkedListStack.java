import java.util.EmptyStackException;
import java.util.LinkedList;

public class LinkedListStack {
	private LinkedList<Employee> EmployeeStack;
	
	public LinkedListStack () {
		this.EmployeeStack = new LinkedList<Employee>();
	}
	
	public void push ( Employee employee ) {
		EmployeeStack.addFirst(employee);
	}
	
	public Employee peek () {
		
		if ( EmployeeStack.isEmpty()){
			throw new EmptyStackException();
		}
		return EmployeeStack.peek();
	}
	
	public Employee pop() {
		if ( EmployeeStack.isEmpty()){
			throw new EmptyStackException();
		}
		return EmployeeStack.pop();
	}
	
	public boolean isEmpty() {
		return EmployeeStack.isEmpty();
	}
	
	public void printStack() {
		for( Employee employee : EmployeeStack) {
			System.out.println(employee);			
		}
	}
	
    public int size() {
        return EmployeeStack.size();
    }

	public static void main(String[] args) {
		
		LinkedListStack stk = new LinkedListStack();
		
		System.out.println("Is Stack Empty :"+ stk.isEmpty());
		
		// Create 4 employees 
		Employee mira  = new Employee("Mira","Bai",12345);
		Employee krish = new Employee("Krish","Kanhaiya",456);
		Employee raghu = new Employee("Raghu","Ragav",890);
		Employee ravan  = new Employee("Raja","Ravan",420);
		
		stk.push(mira);
		stk.push(krish);
		stk.push(raghu);
//		peek 
		System.out.println("Peek :: "+ stk.peek());
		
		stk.push(ravan);		
		
		// print stack
		stk.printStack();
		
		//pop
		System.out.println("pop ::: "+stk.pop());

		// print stack
		stk.printStack();		
		
		
	}
}
