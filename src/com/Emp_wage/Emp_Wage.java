package com.Emp_wage;


class empwage
{
	static int fulltime =8;
	static int rateperhr =20;
	static int random = (int)(Math.random()*10)%2;
	void empattandance() 	//creating method for emp attendance
	{

		if(random == 0)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}

	void Daily_emp_wage()	  //calculating daily empwage for full time
	{
		if(random == 0)
		{
			int daily_wage = fulltime*rateperhr;
			System.out.println("Daily emp wage is "+daily_wage);
		}
		else
		{
			int daily_wage =0;
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
