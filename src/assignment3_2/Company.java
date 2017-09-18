package assignment3_2;
/**
 * To show the use of super and this keyword with a constructor, methods,
variables , using Company, Corporate as Class
 *
 */

public class Company { 						// Company class start

	String employeeName; 					// Declaring employee name as instance variable
	int basicSalary;						// Declaring basic salary as instance variable for class Company
	int hra;								// Declaring hra as instance variable for class Company
	
	Company() { 							// Default constructor to print Welcome message during object instance
		
		System.out.println("Welcome to XYZ Company");
	}
	
	
	Company(String employeeName){ 			// Constructor overloading to display employee name as well
		
		this();								// Calling default constructor using this		
		this.employeeName=employeeName; 	// Using this to assign value to instance variable employeeName
		System.out.println(this.employeeName+" is an employee of this company"); // Printing employee name
	}
	
	void salary(int basicSalary, int hra){ 	//Salary method to print salary
		
		this.basicSalary=basicSalary;		// Using this to assign value to instance variable basicSalary
		this.hra=hra;						// Using this to assign value to instance variable hra
		System.out.println("Salary of the employee is "+(this.basicSalary+this.hra)); // Printing Salary
		
	}

}// class closed

class Corporate extends Company {			// Creating corporate class as child unit to company class
	
	int bonus;								// Declaring bonus as instance variable
	Corporate() {							// Default constructor 
		System.out.println("Welcome to Corporate division"); // Printing welcome message
	}
	
	Corporate(String employeeName) {		// Constructor to print employee from parent and print he is with Corporate division
		
		super(employeeName);				// Using super to call company's parameter constructor
		System.out.println("This employee is assigned to Corporate division");	// Printing that employee with Corporate
		
	}
	
	void salary(int basicSalary,int hra, int bonus) { // Salary method to print salary from Company and additional bonus 
		
		this.bonus=bonus;					// Using this to assign value to instance variable bonus
		super.basicSalary=basicSalary;		// Using super to assign value to instance variable basicSalary of parent
		super.hra=hra;						// Using super to assign value to instance variable hra of parent
		super.salary(basicSalary, hra);		// Calling salary method of parent to display company salary
		System.out.println("Salary after adding bonus from corporate "+this.bonus+" is "+(super.basicSalary+super.hra+this.bonus)); // Printing salary with bonus
		
	}
	
	public static void main(String []args) {// main method start
		
		Corporate employee1=new Corporate("Sandeep"); 	// Creating object of Corporate
		employee1.salary(300000, 10000, 50000);			// Using object and print the salary
		
		
	}
	
	
	
} //Corporate class closed
