class ComputeEmpWage {
    public static final int IS_PARTTIME = 1;
    public static final int IS_FULLTIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int WORKING_DAY = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    public static int ComputeEmpWage() {
        //variable
        int empHrs = 0, totalEmpHours = 0, totalWokinDays = 0;
        //code
        while (totalEmpHours <= MAX_HRS_IN_MONTH && totalWokinDays < WORKING_DAY) {
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
        int totalEmpWage = totalEmpHours * WAGE_PER_HOUR;
        System.out.println("Total Employee Wage: " + totalEmpWage);
        return totalEmpWage;
    }
}







