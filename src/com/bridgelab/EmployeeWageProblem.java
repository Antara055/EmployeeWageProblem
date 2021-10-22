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
        int PARTTIME_HOURS = 4;
        int job_timing = random.nextInt(3);
        if (job_timing == 1) {
            System.out.println("Employee is doing full time job");
            System.out.println("Daily Wages = " + WAGE_PER_HOUR * TOTAL_HOUR);
        }
        else if (job_timing == 2) {
            System.out.println("Employee is doing part time job");
            System.out.println("Daily Wages = " + WAGE_PER_HOUR * PARTTIME_HOURS);
        }
        else
            System.out.println("Employee is absent");
    }
}
