package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.EmployeeOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj03LayeredAppApplication {

	public static void main(String[] args) {
		System.out.print("----------------------------EMPLOYEE DETAILS----------------------------");
		//get IOC container
	 try(ConfigurableApplicationContext ctx=SpringApplication.run(BootProj03LayeredAppApplication.class, args);
			 Scanner sc=new Scanner(System.in);){
		 System.out.print("Enter Designation of First Employee:");
		 String desg1=sc.nextLine().toUpperCase();
		 System.out.print("Enter Designation of Second Employee:");
		 String desg2=sc.nextLine().toUpperCase();
		 System.out.print("Enter Designation of Third Employee:");
		 String desg3=sc.nextLine().toUpperCase();
		 //get controller class obj ref
		 EmployeeOperationsController controller=ctx.getBean("payroll",EmployeeOperationsController.class);
		 
		 //invoke the b.method
		 try {
			 List<Employee> list=controller.showAllEmployeesByDesgs(desg1,desg2,desg3);	
			 //PROCESS THE RESULTS
			 list.forEach(emp->{
				 System.out.println(emp);
			 });
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	}

}
