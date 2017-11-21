package by.exercices.dzmitry.parkhomenka.les04_2.ex4;

import java.util.ArrayList;

public class Logic {
	public void passOrNot(ArrayList<Abiturient> abiturient, int size) {
		if (abiturient.size() <= size) {
			System.out.println("Following students have passed exams: ");
			for (int i = 0; i < abiturient.size(); i++) {
				showPassedAbitur(abiturient, i);
			}
		} else {
			needClarification();
		}
	}
	
	private static void showPassedAbitur(ArrayList<Abiturient> abiturient, int i) {
		System.out.println(abiturient.get(i));
	}
	
	private static void needClarification() {
		System.out.println("There are more students, than we can let enter the university this year. Check our list.");
	}
}
