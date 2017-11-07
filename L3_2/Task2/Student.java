package by.exercices.dzmitry.parkhomenka.les03_2.ex2;

import java.util.Random;

public class Student {
	//описание переменных класса
	int mark1;
	int mark2;
	int mark3;
	int avg;

	Random rand = new Random();

	//создание конструктора начальной инициализации переменных
	public Student() {
		Random rand = new Random();
		this.mark1 = rand.nextInt(10);
		this.mark2 = rand.nextInt(10);
		this.mark3 = rand.nextInt(10);
	}

	//вычисление средней оценки одного студента
	public int avgMark() {
		avg = (this.mark1 + this.mark2 + this.mark3) / 3;
		return avg;
	}

	//определение количества студентов имеющих оценки 8, 9, 10
	public int bestNumber(Student[] spisok) {
		int count = 0;
		for (int i = 0; i < spisok.length; i++) {
			if (spisok[i].avgMark() == 8 || spisok[i].avgMark() == 9 || spisok[i].avgMark() == 10) {
				count++;
			}	
		}
		return count;
	}
	
	//определение количества студентов имеющих оценку 2
	public int worstNumber(Student[] spisok) {
		int count = 0;
		for (int i = 0; i < spisok.length; i++) {
			if (spisok[i].mark1 < 2 || spisok[i].mark2 < 2 || spisok[i].mark3 < 2) {
				count++;
			}
		}
		return count;
	}

	//геттеры и сеттеры
	public int getMark1() {
		return mark1;
	}

	public void setMark1() {
		this.mark1 = rand.nextInt(10);
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2() {
		this.mark2 = rand.nextInt(10);
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3() {
		this.mark3 = rand.nextInt(10);
	}

}
