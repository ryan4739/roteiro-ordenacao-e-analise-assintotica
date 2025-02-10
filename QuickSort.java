public class QuickSort implements Sorting {

	@Override
	public void sort(int[] values) {
		quickSort(values, 0, values.length - 1);	
	}

	public void quickSort(int[] values, int left, int right) {
		if (left < right) {
			int index_pivot = lomutoPartition(values, left, right);
			quickSort(values, left, index_pivot - 1);
			quickSort(values, index_pivot + 1, right);
		}
	}

	public int lomutoPartition(int[] values, int left, int right) {
		
		int pivot = values[left];
		int i = left;

		for (int j = left + 1; j <= right; j++) {
			if (values[j] <= pivot)
				swap(values, ++i, j);
		}

		swap(values, left, i);		

		return i;

	}

	public void swap(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

}
