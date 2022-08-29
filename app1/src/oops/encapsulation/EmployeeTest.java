package oops.encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp=new Employee();
		System.out.println(emp.getEmpId());
		
		emp.setEmpId(300);
		emp.setEmail("yaswanthbudhavaram@gmail.com");
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmail());	
	}

}
