public class EmpWageBuilderUC4 {
        public static void main (String[] args) {
        int EMP_RATE_PER_HR = 20;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
    
switch (empCheck)
{
        case 1:
                int  EmpHrs = 8;
            double salary = (EmpHrs * EMP_RATE_PER_HR);
                System.out.println("Employee is present for full time ");
                 System.out.println("salary is " + salary );
                break;
        

        case 2:
                 EmpHrs = 4;
             salary = (EmpHrs * EMP_RATE_PER_HR);
                System.out.println("Employee is present only for part time");
                 System.out.println("salary is " + salary );
        break;


         default:
                 System.out.println("Employee is Absent");
                 System.out.println("no salary shall be given");
        break;
        }

}
        }
