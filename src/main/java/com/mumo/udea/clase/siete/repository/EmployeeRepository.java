package com.mumo.udea.clase.siete.repository;

import java.util.List;

import com.mumo.udea.clase.siete.modelo.Employee;

public interface EmployeeRepository {
	public Employee add(Employee employee);

	public Employee findById(Long id);

	public List<Employee> findAll();

	public List<Employee> findByDepartment(Long departmentId);

	public List<Employee> findByOrganization(Long organizationId);
}
