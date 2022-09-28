package com.greatlearning.datastructuregroupassignment.main;

import com.greatlearning.datastructuregroupassignment.service.AdminDepartment;
import com.greatlearning.datastructuregroupassignment.service.HrDepartment;
import com.greatlearning.datastructuregroupassignment.service.TechDepartment;

public class DriverClass {
	public static void main(String[] args) {
		AdminDepartment admdept = new AdminDepartment();
		HrDepartment hrdept = new HrDepartment();
		TechDepartment techdept = new TechDepartment();

		System.out.println("Welcome to " + admdept.departmentName());
		System.out.println(admdept.getTodaysWork());
		System.out.println(admdept.getWorkDeadline());
		System.out.println(admdept.isTodayAHoliday());

		System.out.println();

		System.out.println("Welcome to " + hrdept.departmentName());
		System.out.println(hrdept.doActivity());
		System.out.println(hrdept.getTodaysWork());
		System.out.println(hrdept.getWorkDeadline());
		System.out.println(hrdept.isTodayAHoliday());

		System.out.println();

		System.out.println("Welcome to " + techdept.departmentName());
		System.out.println(techdept.getTodaysWork());
		System.out.println(techdept.getWorkDeadline());
		System.out.println(techdept.getTechStackInformation());
		System.out.println(techdept.isTodayAHoliday());

	}
}
