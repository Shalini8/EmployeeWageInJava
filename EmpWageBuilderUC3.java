public class EmpWageBuilderUC3 {
	public static void main (String[] args) {
        int IS_PRESENT_FULLTIME = 1;
        int IS_PRESENT_PARTTIME = 2;
        int EMP_RATE_PER_HR = 20;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        

        if (IS_PRESENT_FULLTIME == empCheck) {
        	int EmpHrs = 8;
            double salary = (EmpHrs * EMP_RATE_PER_HR);
                System.out.println("Employee is present for full time ");
                 System.out.println("salary is " + salary );
        }
        else if (IS_PRESENT_PARTTIME == empCheck) {
        	int EmpHrs = 4;
            double salary = (EmpHrs * EMP_RATE_PER_HR);
                System.out.println("Employee is present only for part time");
                 System.out.println("salary is " + salary );
        }
        
        
         else {
                 System.out.println("Employee is Absent");
                 System.out.println("no salary shall be given");
        }
}
	}


