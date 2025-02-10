import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Executer executer = new Executer();

		int[] values = {7, 8, 1, 2, 90, 4, 65, 32};
		
		System.out.println(Arrays.toString(values));

		executer.executeSortingAlgorithm(new SelectionSort(), values);
		executer.executeSortingAlgorithm(new InsertionSort(), values);
		executer.executeSortingAlgorithm(new MergeSort(), values);
		executer.executeSortingAlgorithm(new QuickSort(), values);
		
		System.out.println(Arrays.toString(values));
	
	}

}
