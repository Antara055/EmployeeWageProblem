package com.bridgelab;
public class EmployeeWageProblem {

    public static final int IS_PARTTIME = 1;
    public static final int IS_FULLTIME = 2;

    private String companyName;
    private int wagePerHrs;
    private int workingDay;
    private int maxHrsPerMonth;
    private int totalEmpWage;

    public EmployeeWageProblem(String companyName, int wagePerHrs, int workingDay, int maxHrsPerMonth){
       this.companyName=companyName;
       this.wagePerHrs=wagePerHrs;
       this.workingDay=workingDay;
       this.maxHrsPerMonth=maxHrsPerMonth;
    }
    public void ComputeEmpWage()
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
        totalEmpWage = totalEmpHours * wagePerHrs;
    }
    @Override
    public String toString(){
        return ("Total Employee Wage for "+companyName+"is :"+totalEmpWage);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage problem");
        EmployeeWageProblem tata=new EmployeeWageProblem("TATA",20,5,200);
        EmployeeWageProblem infosys=new EmployeeWageProblem("INFOSYS", 25,4,180);
        tata.ComputeEmpWage();
        System.out.println(tata);
        infosys.ComputeEmpWage();
        System.out.println(infosys);

    }
}
