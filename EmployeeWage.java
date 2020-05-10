public class EmployeeWage {
	void empSalary() {
		int isFullTime = 1;
		int isPartTime = 0;
		int empRatePrHr = 20;
		int empHr = 0;
		int perDaySalary = 0;
		int mothWorkingDay = 20;
		int monthlySalary = 0;
		int monthyHrs = 0;
		for (int i = 1;i <= mothWorkingDay && monthyHrs <= 100;i++) {
			double empCheck = Math.floor(Math.random() * 10) % 2;
			switch ((int)empCheck)
			{
				case 1 :
					empHr = 8;
					break;
				case 2 :
					empHr = 4;
					break;

			}//switch
			monthyHrs = monthyHrs + empHr;
			System.out.println("working days : "+i);
			System.out.println("monthyHrs wis : "+monthyHrs);
			perDaySalary = empRatePrHr * empHr;
			System.out.println(perDaySalary);
			monthlySalary = perDaySalary + monthlySalary;


		}//forloop
		System.out.println("monthly salary"+monthlySalary);

	}//empWage()
	public static void main(String[] args) {

		EmployeeWage empWage = new EmployeeWage();
		empWage.empSalary();

	}//main()
}//class
