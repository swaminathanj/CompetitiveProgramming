import java.util.ArrayList; 
import java.util.List;
public class Company 
{ 
	public static void main (String[] args) 
	{ 
		Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer"); 
		Developer dev2 = new Developer(101, "Vinay Sharma", "Developer"); 
		CompanyDirectory engDirectory = new CompanyDirectory(); 
		engDirectory.addEmployee(dev1); 
		engDirectory.addEmployee(dev2); 
		
		Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager"); 
		Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager"); 
		
		CompanyDirectory accDirectory = new CompanyDirectory(); 
		accDirectory.addEmployee(man1); 
		accDirectory.addEmployee(man2); 
	
		CompanyDirectory directory = new CompanyDirectory(); 
		directory.addEmployee(engDirectory); 
		directory.addEmployee(accDirectory); 
		directory.showEmployeeDetails(); 
	} 
} 

 

class CompanyDirectory implements Employee 
{ 
	private List<Employee> employeeList = new ArrayList<Employee>(); 
	
	@Override
	public void showEmployeeDetails() 
	{ 
		for(Employee emp:employeeList) 
		{ 
			emp.showEmployeeDetails(); 
		} 
	} 
	
	public void addEmployee(Employee emp) 
	{ 
		employeeList.add(emp); 
	} 
	
	public void removeEmployee(Employee emp) 
	{ 
		employeeList.remove(emp); 
	} 
} 
class Manager implements Employee 
{ 
	private String name; 
	private long empId; 
		private String position; 

	public Manager(long empId, String name, String position) 
	{ 
		this.empId = empId; 
		this.name = name; 
				this.position = position; 
	} 
	
	@Override
	public void showEmployeeDetails() 
	{ 
		System.out.println(empId+" " +name); 
	} 
} 
class Developer implements Employee 
{ 
	private String name; 
	private long empId; 
	private String position; 

	public Developer(long empId, String name, String position) 
	{ 
		this.empId = empId; 
		this.name = name; 
				this.position = position; 
	} 
	
	@Override
	public void showEmployeeDetails() 
	{ 
		System.out.println(empId+" " +name); 
	} 
} 
interface Employee 
{ 
	public void showEmployeeDetails(); 
} 

