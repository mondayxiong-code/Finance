// created by Monday Xiong
package asssignment;

public class FinanceClass{

	private double salary;
	private int age;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void home_loan(double salary, int age) { // check if customer is eligible for a home loan
		if (salary >= 30000 && age > 18) {
			System.out.println("Congratulation you have been approved for a home loan.");
			
		} else {
			System.out.println("Sorry, you are not eligible for a home loan.");
		}
	}

	public void car_loan(double salary, int age) { // check if customer is eligible for a car loan
		if (salary >= 15000 && age > 18) {
			System.out.println("Congratulation you have been approved for a car loan.");
		} else {
			System.out.println("Sorry, you are not eligible for a car loan.");
		}
	}

	public void personal_loan(double salary, int age) { // check if customer is eligible for a personal loan
		if (salary >= 10000 && age > 18) {
			System.out.println("Congratulation you have been approved for a personal loan.");
		} else {
			System.out.println("Sorry, you are not eligible for a personal loan.");
		}
	}

	public static void main(String[] args) {
	}
}
