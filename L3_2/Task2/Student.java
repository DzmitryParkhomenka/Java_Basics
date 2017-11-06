package by.exercices.dzmitry.parkhomenka.les03_2.ex2;

import java.util.Random;

public class Student {
	int mark1;
	int mark2;
	int mark3;
	
	public void setMark() {
		Random rand = new Random();
		this.mark1 = rand.nextInt(10);
		this.mark2 = rand.nextInt(10);
		this.mark3 = rand.nextInt(10);
	}
	
	public int[] getMark() {
		int[] studMarks = new int[3];
		studMarks[0] = this.mark1;
		studMarks[0] = this.mark2;
		studMarks[0] = this.mark3;
		return studMarks;
	}
	
	public int avgMark() {
		int	avg = (this.mark1 + this.mark2 + this.mark3) / 3;
		return avg;
	}
}
