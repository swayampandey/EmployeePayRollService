package com.bridgelabz;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeePayrollService service = new EmployeePayrollService();
        service.welcomeMessage();
        service.readEmployeeData();
        service.writeEmployeeData();
    }
}
