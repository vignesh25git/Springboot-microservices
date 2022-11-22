import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ListClassify {

	public static void main(String[] args) {

		List<Employee> emplist = new ArrayList<>();

		Employee emp1 = new Employee(1, "Sam", "M", 44, 65000, "ECE");
		Employee emp2 = new Employee(2, "Rahul", "M", 42, 85000, "IT");
		Employee emp3 = new Employee(3, "Samantha", "F", 34, 55000, "CSC");
		Employee emp4 = new Employee(4, "Trisha", "F", 38, 35000, "ECE");
		Employee emp5 = new Employee(5, "Ramya", "F", 24, 25000, "IT");
		Employee emp6 = new Employee(6, "Priyanka", "F", 26, 85000, "ECE");
		Employee emp7 = new Employee(7, "Jothika", "F", 42, 95000, "CSC");
		Employee emp8 = new Employee(8, "Simran", "F", 43, 45000, "CSC");
		Employee emp9 = new Employee(9, "Divya", "F", 27, 55000, "IT");

		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		emplist.add(emp6);
		emplist.add(emp7);
		emplist.add(emp8);
		emplist.add(emp9);

//without using Java 8		
		Map<String, List<Employee>> deptmap = new HashMap<>();

		for (Employee employee : emplist) {
			String mapkey = employee.getDept();
			if (deptmap.containsKey(mapkey)) {
				List<Employee> list = deptmap.get(mapkey);
				list.add(employee);
			} else {
				List<Employee> list = new ArrayList<>();
				list.add(employee);
				deptmap.put(mapkey, list);
			}
		}

		System.out.println(deptmap);

//with using Java 8	
		
		Map<String, List<Employee>> deptmap1 = emplist.stream()
				           .collect(Collectors.groupingBy(emp -> emp.getDept()));
		
		System.out.println(deptmap1);

		//Map iteration
		
		Set<Map.Entry<String, List<Employee>>> entryset = deptmap.entrySet();
		
		Iterator<Map.Entry<String, List<Employee>>> itr = entryset.iterator();
		
		while (itr.hasNext()) {
			Map.Entry<String, List<Employee>> mapent = itr.next();
			System.out.println(mapent.getKey());
			System.out.println(mapent.getValue());
		}
	}
}
