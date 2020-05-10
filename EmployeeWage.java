public class EmployeeWage {
	void empSalary() {
		int isFullTime = 0;
		int isPartTime = 2;
		int empRatePrHr = 20;
		int empHr = 0;
		int perDaySalary = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		System.out.println(empCheck);
		switch ((int)empCheck)
		{
			case 0 :
				empHr = 8;
				System.out.println("Full time Employee");
				perDaySalary = empRatePrHr * empHr;
				System.out.println("Employee per day salary = "+perDaySalary);
				return;
			case 1 :
				empHr = 4;
				System.out.println("Part time Employee");
				perDaySalary = empRatePrHr * empHr;
				System.out.println("Employee per day salary = "+perDaySalary);
		}//switch
	}
	public static void main(String[] args) {

		EmployeeWage empWage = new EmployeeWage();
		empWage.empSalary();

	}//main()
}//class
