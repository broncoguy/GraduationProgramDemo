package edu.wmich.cs1120.LarryArmstrong.LA3;

public class Student implements IAuditable {
	private String firstName;
	private String lastName;
	private String StudentID;
	private int creditsCompleted;
	
	public Student(String _firstName, String _lastName, String _studentID, int _creditsCompleted) {
		
		firstName = _firstName;
		lastName = _lastName;
		StudentID = _studentID;
		creditsCompleted = _creditsCompleted;
	}
	
	public  void TakeCourse(String CN, int CH){
		System.out.println(firstName+" "+lastName+" took "+CN+" for "+CH+" credits");
		creditsCompleted += CH;
	}

	public String get_firstName() {
		return firstName;
	}

	public void set_firstName(String _firstName) {
		firstName = _firstName;
	}

	public String get_lastName() {
		return lastName;
	}

	public void set_lastName(String _lastName) {
		lastName = _lastName;
	}

	public String get_StudentID() {
		return StudentID;
	}

	public void set_StudentID(String _StudentID) {
		StudentID = _StudentID;
	}

	public int get_creditsCompleted() {
		return creditsCompleted;
	}

	public void set_creditsCompleted(int _creditsCompleted) {
		creditsCompleted = _creditsCompleted;
	}

	@Override
	public void meetsRequirements() {
		// TODO Auto-generated method stub
		
	}
	

	
	
	
}
