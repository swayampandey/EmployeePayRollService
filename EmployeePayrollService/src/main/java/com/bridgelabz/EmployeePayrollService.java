package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {

    public void welcomeMessage(){
        System.out.println("Welcome to employee payroll service");
    }
    ArrayList<EmployeePayrollData> employeePayrollDataList = new ArrayList<EmployeePayrollData>();

    //creating method to read employee data
    public void readEmployeeData(){
        EmployeePayrollData employeeData = new EmployeePayrollData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id :");
        employeeData.setId(sc.nextInt());
        System.out.println("Enter employee  first name :");
        employeeData.setFirstName(sc.next());
        System.out.println("Enter employee  last name :");
        employeeData.setLastName(sc.next());
        System.out.println("Enter employee salary :");
        employeeData.setSalary(sc.nextDouble());
        employeePayrollDataList.add(employeeData);


    }
    // creating method to write employee data
    public void writeEmployeeData(){
        System.out.println("Employee data is : " +employeePayrollDataList);
    }

}
