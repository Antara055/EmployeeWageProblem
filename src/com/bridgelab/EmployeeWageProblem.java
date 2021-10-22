package com.bridgelab;
import java.util.Random;

public class EmployeeWageProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage problem");
        //This program will check the employee is present or absent
        Random random = new Random();
        //variable
        int WAGE_PER_HOUR = 20;
        int TOTAL_HOUR = 8;
        int PARTTIME_HOURS = 4;
        int WORKING_DAY = 20;
        int daily_wage=0;
        int monthly_wages=0;
        //code

        for (int days_count = 1; days_count <= WORKING_DAY; days_count++) {
            int job_timing = random.nextInt(3);
            switch (job_timing) {
                case 1:
                    daily_wage=WAGE_PER_HOUR * TOTAL_HOUR *days_count;
                    break;
                case 2:
                    daily_wage=WAGE_PER_HOUR * PARTTIME_HOURS *days_count;
                    break;
                case 0:
                    break;
            }
           monthly_wages=daily_wage+monthly_wages;
        }
        System.out.println("Monthly Wages = " +monthly_wages);
    }
}
