public class EmpWageBuilderUC2   {
        public static void main (String[] args) {
     	int IS_PRESENT = 1;
	int EMP_RATE_PER_HR = 20;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        

	if (IS_PRESENT == empCheck){
	 int EmpHrs = 8;
        double salary = (EmpHrs * EMP_RATE_PER_HR);
        System.out.println("Employee is present");
	System.out.println( "salary is " + salary );
	}

        else{
                 System.out.println("Employee is Absent");
        }
    }
}


