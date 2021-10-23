package com.bridgelab;
public class EmployeeWageProblem {

    public static final int IS_PARTTIME = 1;
    public static final int IS_FULLTIME = 2;
    public static int ComputeEmpWage(String companyName, int wagePerHrs, int workingDay, int maxHrsPerMonth)
    {
        //variable
        int empHrs = 0, totalEmpHours = 0, totalWokinDays = 0;
        //code
        while (totalEmpHours <= maxHrsPerMonth && totalWokinDays < workingDay) {
            totalWokinDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PARTTIME:
                    empHrs = 4;
                    break;
                case IS_FULLTIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHours = totalEmpHours + empHrs;
            System.out.println("Days:" + totalWokinDays + "Employee hours:" + empHrs);
        }
        int totalEmpWage = totalEmpHours * wagePerHrs;
        System.out.println("Total Employee Wage for "+companyName+"is :"+totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage problem");
        ComputeEmpWage("TATA",20,5,200);
        ComputeEmpWage("INFOSYS", 25,4,180);
    }
}
