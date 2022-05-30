package com.csi.constructorbasics;

class Employee {
	private int empId;
	private String empName;
	private String empAddress;
	private double empSalary;
	private long empContactNumber;
	private String empEmailId;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, String empAddress, double empSalary, long empContactNumber,
			String empEmailId) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
		this.empContactNumber = empContactNumber;
		this.empEmailId = empEmailId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public long getEmpContactNumber() {
		return empContactNumber;
	}

	public void setEmpContactNumber(long empContactNumber) {
		this.empContactNumber = empContactNumber;
	}

	public String getEmpEmailId() {
		return empEmailId;
	}

	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}

}

public class ConstructorandSetterDiff {
	public static void main(String[] args) {

		Employee employee = new Employee(121, "LAKSHMI", "PUNE", 4546, 5456, "LAKSHMI@CSI.COM");

		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("SWARA");

		System.out.println("\n Employee Id: " + employee.getEmpId() + "\n Employee Name: " + employee.getEmpName()
				+ "\n Employee Address: " + employee.getEmpAddress() + "\n Employee Salary: " + employee.getEmpSalary()
				+ "\n Employee Contact Number: " + employee.getEmpContactNumber() + "\n Employee Email Id: "
				+ employee.getEmpEmailId());
	}
}
