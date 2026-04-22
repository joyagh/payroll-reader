package com.pluralsight;

public class Employees {

    // Create employee Object
    private int id;
    private String name;
    private double hoursWorked;
    private double payRate;

    //Create employee Constructor
    public Employees(int id, String name, double hoursWorked, double payRate){
        this.id = id;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
    // Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    // Ending method for gross pay
    public double getGrossPay(){
        return hoursWorked * payRate;
    }



}
