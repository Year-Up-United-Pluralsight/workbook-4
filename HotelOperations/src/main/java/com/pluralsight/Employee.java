package com.pluralsight;

public class Employee {

// PRIVATE INSTANCE VARIABLES ------------------------------------------------------------------------------------------
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;

// CONSTRUCTOR ---------------------------------------------------------------------------------------------------------
    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }

// GETTERS AND SETTERS -------------------------------------------------------------------------------------------------
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

// DERIVED GETTERS -----------------------------------------------------------------------------------------------------
    public double getTotalPay(){

        // Calculates total pay -- overtime hours have a 1.5x greater pay rate
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
    }

    public double getRegularHours() {

        // If employee didn't work overtime, returns hours worked -- otherwise if he did, returns full regular hours
        return (hoursWorked < 40) ? hoursWorked : 40;
    }

    public double getOvertimeHours() {

        // If employee worked overtime, returns extra hours -- otherwise returns zero overtime hourse
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }
}