package ch16;

public class Employee {
	public static int serialNum = 1000;
	
	private int employeeId;
	private String EmployeeName;
	private String Department;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	
	
}
