package com.bridgelab;
public class EmployeeWageProblem {

    public static final int IS_PARTTIME = 1;
    public static final int IS_FULLTIME = 2;

    private int noOfCompany=0;
    private CompanyWage[] empWageArray;

    public EmployeeWageProblem(){
        empWageArray=new CompanyWage[5];
    }
    private void addCompanyEmpWage(String companyName, int wagePerHrs, int workingDay, int maxHrsPerMonth){
        empWageArray[noOfCompany]=new CompanyWage(companyName,wagePerHrs,workingDay,maxHrsPerMonth);
        noOfCompany++;
    }
    private void computeEmpWage(){
        for(int i =0;i<noOfCompany;i++){
            empWageArray[i].setTotalEmpWage(this.computeEmpWage(empWageArray[i]));
            System.out.println(empWageArray[i]);
        }
    }
    public int  computeEmpWage(CompanyWage companyWage)
    {
        //variable
        int empHrs = 0, totalEmpHours = 0, totalWokinDays = 0;
        //code
        while (totalEmpHours <=companyWage.maxHrsPerMonth && totalWokinDays < companyWage.workingDay) {
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
        return totalEmpHours * companyWage.wagePerHrs;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage problem");
        EmployeeWageProblem EmployeeWageBuilder=new EmployeeWageProblem();
        EmployeeWageBuilder.addCompanyEmpWage("TATA",20,5,200);
        EmployeeWageBuilder.addCompanyEmpWage("INFOSYS", 25,4,180);
        EmployeeWageBuilder.computeEmpWage();

    }
}
