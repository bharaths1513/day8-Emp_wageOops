package com.Emp_wage;


class empwage
{
	static int fulltime = 8;
	static int parttime = 4;
	static int rateperhr = 20;
	static int maxworkingdayspermonth = 20;
	static int maxworkinghrpermonth = 100;
	static int random = (int)(Math.random()*10)%3;
	static int daily_wage;
	static int totalworkinghrs;
	static int totalworkingdays;
	static int emphrs;
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

	void Switch_case()		//employee wage by using switch case
	{
		switch(random)
		{
		case 0:
			daily_wage = fulltime*rateperhr;
			System.out.println("Employee is present for Full time");
			System.out.println("Daily emp wage is "+daily_wage);
			break;
		case 1:
			daily_wage = parttime*rateperhr;
			System.out.println("Employee is present for Part time");
			System.out.println("Daily employee wage is "+daily_wage);
			break;
		case 2:
			daily_wage =0;
			System.out.println("Daily emp wage is "+daily_wage);

		}
	}

	void emp_wage_for_month()		//Calculcating employee wage per month 
	{
		int emp_total_wage = 0;
		for(int day=1; day<=20; day++)
		{
			int random1 = (int)(Math.random()*10)%3;	// This random is only for employee wage calculation per month 
			if(random1 == 0)								
			{
				daily_wage = fulltime*rateperhr;
				System.out.println("Employee is present for Full time");
				System.out.println("Daily emp wage is "+daily_wage);
			}
			else if(random1 ==1)		
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
			emp_total_wage = emp_total_wage+daily_wage; 
		}
		System.out.println("Total employee wage of an employee per month "+emp_total_wage);
	}

	void emp_wage_for_100hr()
	{
		while(totalworkinghrs<=maxworkinghrpermonth && totalworkingdays<=maxworkingdayspermonth)
		{
			int random1 = (int)(Math.random()*10)%3;
			switch(random1)
			{
			case 0:
				emphrs = 8;
				System.out.println("Employee is present for Full time");
				System.out.println("Daily emp wage is "+daily_wage);
				break;
			case 1:
				emphrs = 4;
				System.out.println("Employee is present for Part time");
				System.out.println("Daily employee wage is "+daily_wage);
				break;
			case 2:
				emphrs =0;
				System.out.println("Daily emp wage is "+daily_wage);

			}
			if(totalworkinghrs<=100 )
			{
				totalworkinghrs = totalworkinghrs+emphrs;
				System.out.println("Total hrs worked by employee in a month "+totalworkinghrs);
				int totalempwage = totalworkinghrs*rateperhr;
				System.out.println("Total wage earned by an employee in an month is "+totalempwage);
				System.out.println("Total number day the employee worked "+totalworkingdays);
				totalworkingdays++;
			}
			
		}
	}
}

public class Emp_Wage {
	public static void main(String[] args) {
		System.out.println("Welocome to Employee Wage compution Program");
		empwage o=new empwage();
		o.empattandance();
		o.emp_wage_for_100hr();

	}
}
