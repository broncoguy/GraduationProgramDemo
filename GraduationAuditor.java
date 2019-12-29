package edu.wmich.cs1120.LarryArmstrong.LA3;

public class GraduationAuditor {
	void audit(IAuditable[] students){
		for(int i = 0;i<students.length;i++){
			students[i].meetsRequirements();
		}
	}
}
