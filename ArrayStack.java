import java.util.EmptyStackException;

public class ArrayStack {
	private Employee[] EmployeeStack;
	private int top;
	
	public ArrayStack ( int capacity ) {
		this.EmployeeStack = new Employee[capacity];
	}
	
	public void push ( Employee employee ) {
		//check if the stack if full 
		if ( top == EmployeeStack.length) {
			// resize the array
			Employee[] temp = new Employee[EmployeeStack.length*2];
			System.arraycopy(EmployeeStack, 0, temp, 0, top);
			EmployeeStack = temp;
		}
		
		//add the new element 
		EmployeeStack[top++] = employee;
	}
	
	public Employee peek () {
		
		if ( isEmpty()){
			throw new EmptyStackException();
		}
		return EmployeeStack[top-1];
	}
	
	public Employee pop() {
		if ( isEmpty()){
			throw new EmptyStackException();
		}
		return EmployeeStack[--top];
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public void printStack() {
		for( int i = top-1; i >= 0 ; i--) {
			System.out.println(i +"->"+ EmployeeStack[i]);
		}
	}
	
    public int size() {
        return top;
    }

	public static void main(String[] args) {
		
		ArrayStack stk = new ArrayStack(2);
		
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
