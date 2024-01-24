package Problem2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Professor p0 = new Professor("Umar",4000, LocalDate.parse("2023-02-12"));
		Professor p1 = new Professor("Ayisha",50000,LocalDate.parse("2022-05-11"));
		Professor p2 = new Professor("Aliyu",45000,LocalDate.parse("2023-01-07"));
		p0.setNumPublications(10);
		p1.setNumPublications(11);
		p2.setNumPublications(12);
		Secretary s0 = new Secretary("Hassana",50000,LocalDate.parse("2024-03-10"));
		Secretary s1 = new Secretary("Amal",40000,LocalDate.parse("2020-01-08"));
		s0.setOvertimeHours(200);
		s1.setOvertimeHours(200);
		DeptEmployee[] department = {p0,p1,p2,s0,s1};
		System.out.print("Do you wish to see the sum of all salaries in the department? (Y/N): ");
		Scanner sc = new Scanner(System.in);
		String answer = sc.next();
		if(answer.equalsIgnoreCase("Y")){
			double sum = 0.0;
			for(DeptEmployee de : department) {
				sum += de.computeSalary();
			}
			System.out.println("Sum of all salaries: "+sum);
		}
		

	}

}
