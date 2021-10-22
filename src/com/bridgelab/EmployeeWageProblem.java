package com.bridgelab;
import java.util.Random;

public class EmployeeWageProblem {
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage problem");
        //This program will check the employee is present or absent
        Random random = new Random();
        //variable
        int WAGE_PER_HOUR = 20;
        int TOTAL_HOUR = 8;
        int r = random.nextInt(2);
        if (r == 1) {
            System.out.println("Employee is present");
            System.out.println("DayWage = " + WAGE_PER_HOUR * TOTAL_HOUR);
        }
        else
            System.out.println("Employee is absent");
    }
}
