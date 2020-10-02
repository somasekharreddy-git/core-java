package com.vidvaan.corejava.array03development;

public class EmployeeService {

	public Employee[] selectALL() {

		EmployeeDAO dao = new EmployeeDAO();
		return dao.selectALL();
	}
}
