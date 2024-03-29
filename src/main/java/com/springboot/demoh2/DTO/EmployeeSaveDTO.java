package com.springboot.demoh2.DTO;

public class EmployeeSaveDTO {

    private String employeename;
    private String employeeaddress;
    private int mobile;

    public EmployeeSaveDTO(String employeename, String employeeaddress, int mobile) {
        this.employeename = employeename;
        this.employeeaddress = employeeaddress;
        this.mobile = mobile;
    }

    public EmployeeSaveDTO() {
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeeaddress() {
        return employeeaddress;
    }

    public void setEmployeeaddress(String employeeaddress) {
        this.employeeaddress = employeeaddress;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "EmployeeSaveDTO{" +
                "employeename='" + employeename + '\'' +
                ", employeeaddress='" + employeeaddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
