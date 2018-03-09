package com.hiennt.springmvc.dao;

import java.util.List;

import com.hiennt.springmvc.model.Employee;

public interface EmployeeDAO {
	Employee findById(int id);
	 
    void saveEmployee(Employee employee);
     
    void deleteEmployeeBySsn(String ssn);
     
    List<Employee> findAllEmployees();
 
    Employee findEmployeeBySsn(String ssn);
}
