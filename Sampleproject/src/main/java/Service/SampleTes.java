package Service;

import Controller.SampleTesCon;

public class SampleTes {
	public double calculateYearlySalary(SampleTesCon employeeDetails) {
	      double yearlySalary = 0;
	      yearlySalary = SampleTesCon.getMonthlySalary() * 12;
	      return yearlySalary;
	   }
		
	   // Calculate the appraisal amount of employee
	   public double calculateAppraisal(SampleTesCon employeeDetails) {
	      double appraisal = 0;
			
	      if(SampleTesCon.getMonthlySalary() < 10000){
	         appraisal = 500;
	      }else{
	         appraisal = 1000;
	      }
			
	      return appraisal;
	   }
}
