/*
 * File name : ADS CA1 
 * Author : STEFAN FILIP
 * Student number : C23421806
 * Description of class : THIS REPRESENTS WHAT AN EMPLOYEE IS TO JAVA
 */

//define the Object employee and the information it stores
package application;

public class Employee {

	private String employeeNum;
	private String employeeName;
	private int yearsWorking;
	private String courseName; //training course name

	//constructor 1 - create empty space
	public Employee(){
		employeeNum = "";
		employeeName = "";
		yearsWorking = 0;
		courseName = "";
	}

	//constructor 2 - pass info in
	public Employee( String employeeNum, String employeeName, int yearsWorking, String courseName) {
		this.employeeNum = employeeNum;
		this.employeeName = employeeName;
		this.yearsWorking = yearsWorking;
		this.courseName = courseName;
	}

	//getters
	public String getEmployeeNum() {
		return this.employeeNum;
	}
	public String getEmployeeName() {
		return this.employeeName;
	}
	public int getYearsWorking() {
		return this.yearsWorking;
	}
	public String getCourseName() {
		return this.courseName;
	}

	//setters
	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setYearsWorking(int yearsWorking) {
		this.yearsWorking = yearsWorking;
	}
	public void setEmployeeCourse(String courseName) {
		this.courseName = courseName;
	}

	public String toString(){
		return "employeeNum: " + this.employeeNum + "\n" +
				"employeeName: " + this.employeeName + "\n" +
				"yearsWorking: " + this.yearsWorking + "\n" +
				"courseName: " + this.courseName + "\n";
	}


	//this works for both employee num and course etc..
	//creating our own equals method to check if books are same, if name and author are same then return true. else false
	public boolean equals (Object O) // overriding java's equals method
	{
		Employee e  = (Employee)O;
		if(this.employeeNum.equalsIgnoreCase(e.getEmployeeNum())){
			return true;
		}else
			return false;

	}
}
