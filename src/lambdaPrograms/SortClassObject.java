package lambdaPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	
	private int id;
	
	private String name;
	
	private int salary;
	
	public Employee(int id,
			String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
				
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}

public class SortClassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1, "Bhr",1234);
		Employee e2=new Employee(2, "Preet",1234);
		Employee e3=new Employee(3, "Abc",1234);
		
		
		List<Employee> empList=new ArrayList<Employee>();
		
		
		empList.add(e3);
		empList.add(e2);
		empList.add(e1);
		
		
		Comparator<Employee> sortedEmpByName=Comparator.comparing(Employee::getName).
														thenComparing(Employee::getId);
		
		List<Employee> empSort=empList.stream().sorted(sortedEmpByName).
												collect(Collectors.toList());
		
		//empList.stream().
		
		
		System.out.println("This is list after sorting wrt Name");
		
		for (Employee employee : empSort) {
			System.out.println(employee.getName());
		}
		
	}

}
