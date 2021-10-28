package com.Emp_wage;


class empwage
{
	static int fulltime = 8;
	static int parttime = 4;
	static int rateperhr = 20;
	static int random = (int)(Math.random()*10)%3;
	static int daily_wage;
	void empattandance() 	//creating method for emp attendance
	{

		if(random == 2)
		{
			System.out.println("Employee is absent");
		}
		else
		{
			System.out.println("Employee is present");
		}
	}

	void Daily_emp_wage()	  //calculating daily empwage for full time
	{
		if(random == 0)
		{
			daily_wage = fulltime*rateperhr;
			System.out.println("Employee is present for Full time");
			System.out.println("Daily emp wage is "+daily_wage);
		}
		else if(random ==1)		//calculating employee wage for part time
		{
			daily_wage = parttime*rateperhr;
			System.out.println("Employee is present for Part time");
			System.out.println("Daily employee wage is "+daily_wage);
		}
		else
		{
			daily_wage =0;
			System.out.println("Daily emp wage is "+daily_wage);
		}
	}
	



}

public class Emp_Wage {
	public static void main(String[] args) {
		System.out.println("Welocome to Employee Wage compution Program");
		empwage o=new empwage();
		o.empattandance();
		o.Daily_emp_wage();

	}
}
