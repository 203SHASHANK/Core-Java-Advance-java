package javabean;
import java.util.Scanner;
public class Mobilemainclass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Mobile m = new Mobile();
		
		System.out.println(" enter brand");
		m.setBrand(scan.nextLine());
		
		System.out.println(" enter cost");
		m.setCost(scan.nextInt());

		System.out.println("Brand :  "+m.getbrand());
		
		System.out.println("Cost :  "+m.getcost());

		scan.close();
	}

}
