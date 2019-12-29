package edu.wmich.cs1120.LarryArmstrong.LA3;

public class GraduateStudent extends Student{
	
	private int Papers;

	public GraduateStudent(String _firstName, String _lastName, String _studentID, int _creditsCompleted, int _Papers) {
		
		super(_firstName,_lastName, _studentID, _creditsCompleted);

		Papers = _Papers;
}
	
	public void MeetsRequirements(){
		if ((getPapers() < 2) && (get_creditsCompleted() < 30)){
			System.out.println(get_firstName() + get_lastName() + get_StudentID() + " will not gradute yet" );
		}
		else{
			System.out.println(get_firstName() + get_lastName() + get_StudentID() + " will gradute" );
		}
	}
	
	public int getPapers() {
		return Papers;
	}
	public void setPapers(int papers) {
		Papers = papers;
	}
	
}
