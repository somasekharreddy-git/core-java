package com.vidvaan.corejava.array03development;

public class EmployeeDAO {

	public Employee[] selectALL() {
		Employee employee0 = new Employee(101, "vidvaan", 000.00);
		Employee employee1 = new Employee(102, "narayana", 10.00);
		Employee employee2 = new Employee(103, "chandra", 100.00);
		Employee employee3 = new Employee(104, "eswar", 1000.00);
		Employee employee4 = new Employee(105, "balaji", 10000.00);
		Employee employee5 = new Employee(106, "sekhar", 100000.00);

		Employee[] emps = new Employee[6];
		emps[0] = employee0;
		emps[1] = employee1;
		emps[2] = employee2;
		emps[3] = employee3;
		emps[4] = employee4;
		emps[5] = employee5;
		return emps;
	}
}
