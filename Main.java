import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		MergeSort ms = new MergeSort();
		int[] arr = {1, 3, 5, 2, 4, 6};
		ms.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
