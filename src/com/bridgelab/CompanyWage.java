package com.bridgelab;

public class CompanyWage {
    public String companyName;
    public int wagePerHrs;
    public int workingDay;
    public int maxHrsPerMonth;
    public int totalEmpWage;

    public CompanyWage(String companyName, int wagePerHrs, int workingDay, int maxHrsPerMonth) {
        this.companyName = companyName;
        this.wagePerHrs = wagePerHrs;
        this.workingDay = workingDay;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }
    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage=totalEmpWage;
    }
    @Override
    public String toString(){
        return ("Total Employee Wage for "+companyName+"is :"+totalEmpWage);
    }
}
