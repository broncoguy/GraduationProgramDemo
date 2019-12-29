package edu.wmich.cs1120.LarryArmstrong.LA3;

public class UndergradStudent extends Student {
	
	private int CommunityHours;
	
	public UndergradStudent(String _firstName, String _lastName, String _studentID, int _creditsCompleted, int _CommunityHours) {
		
		super(_firstName,_lastName, _studentID, _creditsCompleted);
		
		CommunityHours = _CommunityHours;
	}
	
	public void meetsRequirements(){
		if ((getCommunityHours() < 20) && (get_creditsCompleted() < 30)){
			System.out.println(get_firstName() + get_lastName() + get_StudentID() + " will not gradute yet" );
		}
		else{
			System.out.println(get_firstName() + get_lastName() + get_StudentID() + " will gradute" );
		}
	}
		
	
	


	public int getCommunityHours() {
		return CommunityHours;
	}


	public void setCommunityHours(int communityHours) {
		CommunityHours = communityHours;
	}
	

	
}
