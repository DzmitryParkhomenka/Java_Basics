package by.exercices.dzmitry.parkhomenka.les03_2.ex2;

public class Exercice2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		
		Group group = new Group();
		Student[] mas = new Student[3];
		mas[0] = s1;
		mas[1] = s2;
		mas[2] = s3;
		group.studentsGroup = mas;
		
		
		s1.setMark();
		s2.setMark();
		s3.setMark();
		
		
		int[] s1Marks = s1.getMark();
		int[] s2Marks = s2.getMark();
		int[] s3Marks = s3.getMark();
		
		
		int avgS1 = s1.avgMark();
		int avgS2 = s2.avgMark();
		int avgS3 = s3.avgMark();
		
		
		int grAvg = 0;
		int grTotal = 0;
		for (int i = 0; i < mas.length; i++) {
			grTotal = grTotal + mas[i].avgMark();
		}
		
		grAvg = grTotal / mas.length;
		
		
		int goodStud = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i].avgMark() == 5) {
				goodStud++;
			}
		}
		
		int badStud = 0;
		int badStudCount = 0;
		for (int i = 0; i < mas.length; i++) {
			int[] allMarks = mas[i].getMark();
			int count = 0;
			for (int j = 0; j < allMarks.length; j++) {
				if (allMarks[j] == 2 && count == 0) {
					badStud++;
					count++;
				}
				if (badStud > 0) {
					badStudCount++;
				}
			}
		}
		
		System.out.println("Средний балл по группе - " + grAvg);
		System.out.println("Средний балл студента 1 - " + avgS1 + ", средний балл студента 2 - " + avgS2 + ", средний балл студента 3 - " + avgS3);
		System.out.println("Число отличников - " + goodStud);
		System.out.println("Количество студентов имеющих 0, 1, 2 - " + badStudCount);
	}
}
