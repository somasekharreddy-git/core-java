package com.vidvaan.corejava.array03development;

public class EmployeeController {

	public void selectALL() {

		EmployeeService employeeService = new EmployeeService();
		Employee[] employees = employeeService.selectALL();

		for (Employee employee : employees) {
			System.out.println("Employee Number:: " + employee.getEmpno());
			System.out.println("Employee Name: " + employee.getEname());
			System.out.println("Employee Salary:: " + employee.getSal());
			System.out.println("*******************************");
		}
	}

	public static void main(String[] args) {
		EmployeeController controller = new EmployeeController();
		controller.selectALL();
		// String s = null;
		// String string = new String(s);
		// System.out.println(null + s);
		// String string = new String(null);
	}
}
