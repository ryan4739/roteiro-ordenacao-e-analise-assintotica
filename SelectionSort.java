public class SelectionSort implements Sorting {

	@Override
	public void sort(int[] v) {
			
	}

	public void swap(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

}
