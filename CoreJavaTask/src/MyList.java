import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class MyList {
	
	public static void main(String[] args) {
	
		
		List<Employee> emplist = new ArrayList<>();

		
		
		Employee emp1 = new Employee(1,"Sam","M",44,65000,"ECE");
		Employee emp2 = new Employee(2,"Rahul","M",42,85000,"IT");
		Employee emp3 = new Employee(3,"Samantha","F",34,55000,"CSC");
		Employee emp4 = new Employee(4,"Trisha","F",38,35000,"ECE");
		Employee emp5 = new Employee(5,"Ramya","F",24,25000,"IT");
		Employee emp6 = new Employee(6,"Priyanka","F",26,85000,"ECE");
		Employee emp7 = new Employee(7,"Jothika","F",42,95000,"CSC");
		Employee emp8 = new Employee(8,"Simran","F",43,45000,"CSC");
		Employee emp9 = new Employee(9,"Divya","F",27,55000,"IT");

		
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		emplist.add(emp6);
		emplist.add(emp7);
		emplist.add(emp8);
		emplist.add(emp9);
		
		List<Person> personlist = new ArrayList<>();
		
		
		Person per1 = new Person(10,"Sam",44,"M",1);
		Person per2 = new Person(20,"Rahul",42,"M",2);
		Person per3 = new Person(30,"Samantha",34,"F",3);
		Person per4 = new Person(40,"Trisha",38,"F",4);
		Person per5 = new Person(50,"Ramya",24,"F",5);
		Person per6 = new Person(60,"Priyanka",26,"F",6);
		Person per7 = new Person(70,"Jothika",42,"F",7);
		Person per8 = new Person(80,"Simran",43,"F",8);
		Person per9 = new Person(90,"Divya",27,"F",9);
		
		personlist.add(per1);
		personlist.add(per2);
		personlist.add(per3);
		personlist.add(per4);
		personlist.add(per5);
		personlist.add(per6);
		personlist.add(per7);
		personlist.add(per8);
		personlist.add(per9);
		
		int inputemployee = 3;
		
		Employee e = emplist.get(inputemployee);
		
		System.out.println(e);
		
		for(Person person : personlist) {
			
			if (person.getEmpid()==e.getEmpid()) {
				
				System.out.println(person);

			}
		}
		
		System.out.println("******");
		emplist.stream()
		       .filter(emp -> emp.getEmpid() == inputemployee)
		       .collect(Collectors.toList())
		       .forEach(System.out::println);
		
	//	personlist.forEach(System.out::println);
	//	emplist.forEach(System.out::println);
		
        //List<Employee>  convert List<String> -> Data Transformation
        //mapping : Employee -> employee.getEmpname()()
        //Employee -> employee.getEmpname()  one to one mapping
		
		emplist.stream()
		.map(emp -> emp.getEmpname().toUpperCase())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		emplist.stream()
		.map(emp -> emp.getEmpname())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		
		
		

		
		
		
	}
	
	
	

}
