public class MergeSort implements Sorting {

	@Override
	public void sort(int[] v) {
		mergeSort(v, 0, v.length - 1);
	}

	public void mergeSort(int[] v, int left, int right) {
		
		if (left >= right)
			return;
		
		int middle = (left + right)/2;

		mergeSort(v, left, middle);
		mergeSort(v, middle + 1, right);

		merge(v, left, middle, right);

	}

	public void merge(int[] v, int left, int middle, int right) {
		
		int size = right - left + 1;

		int[] helper = new int[size];
		for (int i = 0; i < size; i++)
			helper[i] = v[left + i];

		int i = 0;
		int j = middle - left + 1;
		int k = left;

		while (i <= middle - left && j <= right - left) {
			if (helper[i] <= helper[j])
				v[k++] = helper[i++];
			else
				v[k++] = helper[j++];
		}

		while (i <= middle - left)
			v[k++] = helper[i++];
		while (j <= right - left)
			v[k++] = helper[j++];

	}

	@Override
	public String getName() {
		return "Merge";
	}

}
