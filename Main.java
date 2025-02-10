import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
			
		//SelectionSort ss = new SelectionSort();
		InsertionSort is = new InsertionSort();
		MergeSort ms = new MergeSort();
		QuickSort qs = new QuickSort();

		int[] values = {7, 8, 1, 2, 90, 4, 65, 32};
		System.out.println(Arrays.toString(values));

		//ss.sort(values);
		is.sort(values);
		//ms.sort(values);
		//qs.sort(values);

		System.out.println(Arrays.toString(values));
	
	}

}
