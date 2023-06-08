package employee_wage_computation;

import java.util.Random;

public class CalculateDailyWage {
    int wagePerHour = 20;
    int workingDaysPerMonth = 6;
    int maxHoursPerMonth = 100;


    //variables
    int empHrs = 0;
    int totalEmpHrs=0;
    int totalWorkingDays=0;

//    int toatalEmpHrs = 0;


    public void generateAttendance() {

        while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays <= workingDaysPerMonth){
            totalWorkingDays++;
            Random rd = new Random(); // creating Random object
            int attendence = rd.nextInt(3);
            switch (attendence) {
                case 0:
                    System.out.println("Employee is absent ");
                    empHrs = 0;
                    break;
                case 1:
                    System.out.println("Employee is present");
//                    empWage = wagePerHour * fullDayHour * workingDaysPerMonth;
//                    System.out.println("Employee wage is : "+ empWage);
                    empHrs = 8;
                    break;
                case 2:
                    System.out.println("Employee was present half-time");
//                    empWage = wagePerHour * halfDayHour * workingDaysPerMonth;
//                    System.out.println("Employee wage is : "+ empWage);
                    empHrs = 4;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day" + totalWorkingDays + " Emp Hrs:" +empHrs);
            System.out.println("");
        }
        int totalEmpWage = totalEmpHrs * wagePerHour;
        System.out.println("Total Emp Wage is : " + totalEmpWage);



    }
}
