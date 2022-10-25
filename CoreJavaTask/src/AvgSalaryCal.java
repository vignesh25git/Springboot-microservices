import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class AvgSalaryCal {

	public static void main(String[] args) {
		
		List<Employee> emplist = new ArrayList<>();
		
		Employee emp1 = new Employee(1,"Sam","M",44,65000);
		Employee emp2 = new Employee(2,"Rahul","M",42,85000);
		Employee emp3 = new Employee(3,"Samantha","F",34,55000);
		Employee emp4 = new Employee(4,"Trisha","F",38,35000);
		Employee emp5 = new Employee(5,"Ramya","F",24,25000);
		Employee emp6 = new Employee(6,"Priyanka","F",26,85000);
		Employee emp7 = new Employee(7,"Jothika","F",42,95000);
		Employee emp8 = new Employee(8,"Simran","F",43,45000);
		Employee emp9 = new Employee(9,"Divya","F",27,55000);

		
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		emplist.add(emp6);
		emplist.add(emp7);
		emplist.add(emp8);
		emplist.add(emp9);
		
	//	emplist.forEach(empl -> System.out.println(empl));
		
//	emplist.stream()
//	       .filter(employee -> employee.getEmpgender().equals("F"))
//	       .collect(Collectors.toList())
//		   .forEach(empl -> System.out.println(empl));	
	
	IntSummaryStatistics iss = emplist.stream()
           .filter(employee -> employee.getEmpgender().equals("F"))
           .mapToInt(employee -> employee.getEmpsalary())
           .summaryStatistics();
	
	System.out.println("Average salary of female employee is " + iss.getAverage());
	
		

	}

}
