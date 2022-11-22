
public class Person {
	
	private int personid;
	private String personname;
	private int personage;
	private String persongender;
	private int empid;
	
	public Person(int personid, String personname, int personage, String persongender, int empid) {
		super();
		this.personid = personid;
		this.personname = personname;
		this.personage = personage;
		this.persongender = persongender;
		this.empid = empid;
	}

	public Person() {
		super();
	}

	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
	}
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	public int getPersonage() {
		return personage;
	}
	public void setPersonage(int personage) {
		this.personage = personage;
	}
	public String getPersongender() {
		return persongender;
	}
	public void setPersongender(String persongender) {
		this.persongender = persongender;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Person [personid=" + personid + ", personname=" + personname + ", personage=" + personage
				+ ", persongender=" + persongender + ", empid=" + empid + "]";
	}
	
	
	

}
