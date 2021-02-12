package com.rkdevblog.karate.dto;

import com.rkdevblog.karate.model.Employee;

import java.util.List;

public class AllEmployeeResponseDto {

    private List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
    
}
