package Problem2;

import java.time.LocalDate;
import java.util.Date;

public class Professor extends DeptEmployee {

	private int numPublications;

	public Professor(String name, double salary, LocalDate hireDate){
		super(name,salary,hireDate);
	}
	public int getNumPublications() {
		return numPublications;
	}

	public void setNumPublications(int numPublications) {
		this.numPublications = numPublications;
	}
}
