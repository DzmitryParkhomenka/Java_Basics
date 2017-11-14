package by.exercices.dzmitry.parkhomenka.les04_1.ex2;

public class ArrayLogic {
	// инициализация двумерного массива
	public int[][] initDoubleArray(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				mas[i][j] = (int) (Math.random() * 1000);
			}
		}
		return mas;
	}

	//сортировка массива по столбцам
	public int[][] sortDoubleArray(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				for (int m = 0; m < mas.length; m++) {
					for (int n = 0; n < mas[m].length; n++) {
						if (mas[n][m] > mas[j][i]) {
							int temp = mas[n][m];
							mas[n][m] = mas[j][i];
							mas[j][i] = temp;
						}
					}
				}
			}
		}
		return mas;
	}

	//вывод массива на консоль
	public void showArray(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				System.out.printf("[%-3d]", mas[i][j]);
			}
			System.out.println();
		}
	}
}
