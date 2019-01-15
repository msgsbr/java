package entities;

public class Student {

	public String name;
	public double first;
	public double second;
	public double third;
	
	public static void main(String[] args) {

	}
	
	public double finalGrade() {
		return first + second + third;
	}

	public boolean status() {
		boolean message = false;
		if(finalGrade() >= 60.00)
			message = true;
		return message;
	}
	
	public double missingPoints() {
		return 60.00 - finalGrade();
	}

}
