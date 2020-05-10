public class EmployeeWage {
	void empSalary() {
		int isFullTime = 0;
		int isPartTime = 2;
		int empRatePrHr = 20;
		int empHr = 0;
		int perDaySalary = 0;
		int mothWorkingDay = 20;
		int monthlySalary = 0;
		for (int i = 1;i <= mothWorkingDay;i++)
		{
			double empCheck = Math.floor(Math.random() * 10) % 2;
			switch ((int)empCheck)
			{
				case 0 :
					empHr = 8;
					break;

				case 1 :
					empHr = 4;
					break;

			}//switch
			perDaySalary = empRatePrHr * empHr;

			monthlySalary = perDaySalary + monthlySalary;

		}
		System.out.println("Monthly salary: "+monthlySalary);

	}
	public static void main(String[] args) {
		EmployeeWage empWage = new EmployeeWage();
		empWage.empSalary();

	}//main()
}//class

