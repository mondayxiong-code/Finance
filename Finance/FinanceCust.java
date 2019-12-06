// created by Monday Xiong
package asssignment;

import java.util.Scanner;

public class FinanceCust extends FinanceClass {
		
	public void validateAge(int age)	//Exceptional handling for age
	{
		if(age<19) throw new FinanceException("The age you enter was 18 and under.");	
		
		else
		System.out.println("");
	}
	
	public void validateSalary(double salary)	//Exceptional handling for salary
	{
		if(salary<=10000) throw new FinanceException("The salary you enter was not within the expected amount to be able to be eligiable to reviece a loan.");
		
		else
		System.out.println("");
	}

	public static void main(String[] args) {
		FinanceClass a = new FinanceClass();	//object for parent class
		FinanceCust b = new FinanceCust();		//object for child class
		Scanner sc = new Scanner(System.in); 	
		
		// taking in the user information
		
		System.out.println("Enter your name: ");
		String name = sc.next();

		System.out.println("Enter your address: ");
		String address = sc.next();

		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		b.validateAge(age);	//Exception Handling 
		
		System.out.println("Enter your salary: ");
		double salary = sc.nextDouble();
		b.validateSalary(salary);	//Exception Handling 
		
		System.out.println();

		//ask customer what kind of loan they would like to get 
		
		System.out.println("Would you like to get a home loan? Enter yes or no.");
		String homeLoan = sc.next();

		boolean hloan;
		if (homeLoan.equals("yes")) {	//store answer as a boolean 
			hloan = true;
		} else {
			hloan = false;
		}

		System.out.println("Would you like to get a car loan? Enter yes or no.");
		String carLoan = sc.next();
		boolean cloan;
		if (carLoan.equals("yes")) {	//store answer as a boolean 
			cloan = true;
		} else {
			cloan = false;
		}
		
		System.out.println("Would you like to get a personal loan? Enter yes or no.");
		String personalLoan = sc.next();
		boolean ploan;
		if (personalLoan.equals("yes")) {	//store answer as a boolean 
			ploan = true;
		} else {
			ploan = false;
		}
		
		System.out.println();
		
		if (hloan == true) {
			a.home_loan(salary, age);			
		}

		if (cloan == true) {
			a.car_loan(salary, age);
		}

		if (ploan == true) {
			a.personal_loan(salary, age);
		}
	}
}
