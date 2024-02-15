package com.springboot.demoh2.service;
import com.springboot.demoh2.DTO.EmployeeDTO;
import com.springboot.demoh2.DTO.EmployeeSaveDTO;
import com.springboot.demoh2.DTO.EmployeeUpdateDTO;
 
import java.util.List;
 
public interface EmployeeService {
    String addEmployee(EmployeeSaveDTO employeeSaveDTO);
 
    List<EmployeeDTO> getAllEmployee();
 
    String updateEmployees(EmployeeUpdateDTO employeeUpdateDTO);
 
    boolean deleteEmployee(int id);
}