package model;

import main.Employee;

public class EmpBusinessLogic {
	
	/*
	 * public double calculateYearlySalary(Employee employee) { return 0.0; }
	 * 
	 * public double calculateAppraisal(Employee employee) { return 0.0; }
	 */

	public double calculateYearlySalary(Employee employee) {
		double yearlySalary = 0;
		yearlySalary = employee.getMonthlySalary() * 12;
		return yearlySalary;

	}

	public double calculateAppraisal(Employee employee) {
		double appraisal = 0;

		if (employee.getMonthlySalary() < 10000) {
			appraisal = 500;
		} else {
			appraisal = 1000;
		}
		
		return appraisal;
	}
	
	public boolean isRetirementAge(Employee employee) {
		boolean retireAge;
		if (employee.getAge() > 65) {
			retireAge = true;
		} else {
			retireAge = false;					
		}
		
		return retireAge;
	}
}
