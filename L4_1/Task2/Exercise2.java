package by.exercices.dzmitry.parkhomenka.les04_1.ex2;

public class Exercise2 {

	public static void main(String[] args) {
		ArrayLogic call = new ArrayLogic();
		int[][] mas = new int[5][5];
		
		mas = call.initDoubleArray(mas);
		call.showArray(mas);
		
		System.out.println("---------------------------------------------------------------------");
		
		call.sortDoubleArray(mas);
		call.showArray(mas);
	}
}
