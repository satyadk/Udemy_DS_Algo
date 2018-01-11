
public class EmployeeNodeDLL {
	
	private Employee employee;
	private EmployeeNodeDLL next;
	private EmployeeNodeDLL previous;
	
	public EmployeeNodeDLL( Employee employee) {
		this.employee = employee;
	}

	public EmployeeNodeDLL getPrevious() {
		return previous;
	}

	public void setPrevious(EmployeeNodeDLL previous) {
		this.previous = previous;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNodeDLL getNext() {
		return next;
	}

	public void setNext(EmployeeNodeDLL next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return employee.toString();
	}

	
}
