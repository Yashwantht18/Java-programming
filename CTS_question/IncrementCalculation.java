import java.util.Scanner;

class IncrementCalculation{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Salary: ");
		int Salary = in.nextInt();
		System.out.println("Enter the Performance appraisal rating: ");
		float appraisal = in.nextFloat	();
		int percent = 0;
		System.out.println(appraisal >= 1.0 && appraisal <= 3.0);
		System.out.println(appraisal >= 3.1 && appraisal <= 4.0);
		System.out.println(appraisal >= 4.1 && appraisal <= 5.0);
		if(Salary < 0){
			if(appraisal >= 1.0 && appraisal <= 3.0){
				percent = 10;
			}
			else if(appraisal >= 3.1 && appraisal <= 4.0){
				percent = 25;
			}
			else if(appraisal >= 4.1 && appraisal <= 5.0){
				System.out.println("Yes");
				percent = 30;
			}
			double IncrementSalary = (percent/100.0) * Salary + Salary;
			System.out.println(IncrementSalary);
			}
		else{
			System.out.println("Invalid Input");
		}
	}
}