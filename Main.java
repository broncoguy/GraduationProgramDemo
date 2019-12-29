package edu.wmich.cs1120.LarryArmstrong.LA3;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String PrintUnder;
		String PrintGrad;
		UndergradStudent[] undergrads = new UndergradStudent[3];
		GraduateStudent [] graduates = new GraduateStudent[3];
		Scanner key = new Scanner(System.in);

		
		undergrads[0] = new UndergradStudent("Blanche", "Graves", "111", 24, 2);
		undergrads[0].TakeCourse("CS 1120", 3);
		undergrads[1] = new UndergradStudent("John", "Doe", "112", 1, 15);
		undergrads[1].TakeCourse("ME 1120", 4);
		undergrads[2] = new UndergradStudent("Nancy", "Grace", "113", 54, 34);
		undergrads[2].TakeCourse("ENG 1110", 4);
		
		System.out.println("");
		
		graduates[0] = new GraduateStudent("Tim", "Allen", "114", 24, 5);
		graduates[0].TakeCourse("CS 4410", 4);
		graduates[1] = new GraduateStudent("Sarah", "Parker", "115", 15, 7);
		graduates[1].TakeCourse("ME 6643", 5);
		graduates[2] = new GraduateStudent("Susie", "Anthony", "116", 84, 10);
		graduates[2].TakeCourse("ENG 6570", 4);
		
		System.out.println("");
		
		undergrads[0].meetsRequirements();
		undergrads[1].meetsRequirements();
		undergrads[2].meetsRequirements();
		
		System.out.println("");
		
		graduates[0].MeetsRequirements();
		graduates[1].MeetsRequirements();
		graduates[2].MeetsRequirements();
		
	}
	
	
}
