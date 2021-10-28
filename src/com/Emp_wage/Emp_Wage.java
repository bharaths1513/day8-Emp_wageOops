package com.Emp_wage;


class empwage
{

	void empattandance()
	{
		int random = (int)(Math.random()*10)%2;
		if(random == 0)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}

}

public class Emp_Wage {
	public static void main(String[] args) {
		System.out.println("Welocome to Employee Wage compution Program");
		empwage o=new empwage();
		o.empattandance();
	}
}
