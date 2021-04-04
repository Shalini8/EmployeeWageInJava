public class EmpWageBuilderUC5 {
	public static void main (String[] args) {
        int EMP_RATE_PER_HR = 20;
        int TOTAL_WORKING_DAYS=20;
        int  EmpHrs =0;
        int total_working_hr_of_a_month =0;
        for (int counter=1; counter<=TOTAL_WORKING_DAYS;counter++ )
        {

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
    
switch (empCheck)
{
        case 1:
                 EmpHrs = 8;
             System.out.println("Employee is present for full time ");
                    break;
        

        case 2:
                 EmpHrs = 4;
             System.out.println("Employee is present only for part time");
               break;


         default:
        	 EmpHrs = 0;
                 System.out.println("Employee is Absent");
                 System.out.println("no salary shall be given");
        break;
        }
total_working_hr_of_a_month = (total_working_hr_of_a_month + EmpHrs);
}
        int  salary = (total_working_hr_of_a_month * EMP_RATE_PER_HR);
        System.out.println("salary is " + salary );
        }

}

