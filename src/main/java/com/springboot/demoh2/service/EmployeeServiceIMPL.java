package com.springboot.demoh2.service;

import com.springboot.demoh2.EmployeeRepo.EmployeeRepo;
import com.springboot.demoh2.DTO.EmployeeDTO;
import com.springboot.demoh2.DTO.EmployeeSaveDTO;
import com.springboot.demoh2.DTO.EmployeeUpdateDTO;
import com.springboot.demoh2.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.ArrayList;
import java.util.List;
 
@Service
public class EmployeeServiceIMPL implements EmployeeService
{
    @Autowired
    private EmployeeRepo employeeRepo;
 
    @Override
    public String addEmployee(EmployeeSaveDTO employeeSaveDTO)
    {
        Employee employee = new Employee(
 
                employeeSaveDTO.getEmployeename(),
                employeeSaveDTO.getEmployeeaddress(),
                employeeSaveDTO.getMobile()
        );
        employeeRepo.save(employee);
        return employee.getEmployeename();
    }
 
    @Override
    public List<EmployeeDTO> getAllEmployee() {
       List<Employee> getemployees = employeeRepo.findAll();
       List<EmployeeDTO> employeeDTOList = new ArrayList<>();
       for(Employee a:getemployees)
       {
            EmployeeDTO employeeDTO = new EmployeeDTO(
 
                   a.getEmployeeid(),
                   a.getEmployeename(),
                   a.getEmployeeaddress(),
                   a.getMobile()
           );
           employeeDTOList.add(employeeDTO);
       }
 
       return  employeeDTOList;
    }
 
    @Override
    public String updateEmployees(EmployeeUpdateDTO employeeUpdateDTO)
    {
        if (employeeRepo.existsById(employeeUpdateDTO.getEmployeeid())) {
            Employee employee = employeeRepo.getById(employeeUpdateDTO.getEmployeeid());
 
 
            employee.setEmployeename(employeeUpdateDTO.getEmployeename());
            employee.setEmployeeaddress(employeeUpdateDTO.getEmployeeaddress());
            employee.setMobile(employeeUpdateDTO.getMobile());
            employeeRepo.save(employee);
        }
            else
            {
                System.out.println("Employee ID do not Exist");
            }
 
                return null;
        }
 
    @Override
    public boolean deleteEmployee(int id) {
 
        if(employeeRepo.existsById(id))
        {
            employeeRepo.deleteById(id);
        }
        else
        {
            System.out.println("Employee id not found");
        }
 
        return true;
    }
}