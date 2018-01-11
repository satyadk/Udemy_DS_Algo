//import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListEx {

	public static void main(String[] args ) {
		
//		List<Employee> employeeList = new ArrayList<>();
		List<Employee> employeeList = new Vector<>();
		
		// add
		employeeList.add(new Employee("Mira","Bai",12345));
		employeeList.add(new Employee("Krish","Kanhaiya",456));
		employeeList.add(new Employee("Raghu","Ragav",890));
		
//		employeeList.forEach(employee -> System.out.println(employee));
		
		//add in between 
		// worst case O(n)
		employeeList.add(2,new Employee("Raja","Ravan",8090));
//		employeeList.forEach(employee -> System.out.println(employee));
		
		// fetch values for given index
		// O(1)
		System.out.println(employeeList.get(2));
		
		// remove 
		//worst case O(n)
		employeeList.remove(2);
		employeeList.forEach(employee -> System.out.println(employee));
	}
}
