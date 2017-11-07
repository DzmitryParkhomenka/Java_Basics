package by.exercices.dzmitry.parkhomenka.les03_2.ex2;

public class Group {
	//массив типа Student для хранения ссылок на обьекты класса Student
	Student[] spisok = new Student[3];
	
	//определение средней оценки по всей группе
	public int avgGroup(Student[] spisok) {
		int[] avgGrMark = new int[3];
		for (int i = 0; i < spisok.length; i++) {
			avgGrMark[i] = spisok[i].avgMark();
		}
		int avg;
		avg = (avgGrMark[0] + avgGrMark[1] + avgGrMark[2]) / 3;
		return avg;
	}
}
