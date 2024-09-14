package javabean;
import java.util.Scanner;
public class EmployeeMainClass {

	public static void main(String[] args) {

		Employee e = new Employee();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter id  :");
		e.setId(scan.nextInt());
		
		System.out.println("enter name  :");
		e.setName(scan.next());
		
		
		
		System.out.println("enter salary  :");
		e.setSalary(scan.nextInt());
		
		System.out.println("id is :"+ e.getId());
		System.out.println("name is :"+ e.getName());
		System.out.println("salary is :"+e.getSalary());


		scan.close();


	}

}
