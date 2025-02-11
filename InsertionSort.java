public class InsertionSort implements Sorting {

	@Override
	public void sort(int[] v) {
		for (int i = 1; i <= v.length - 1; i++) {
			for (int j = i; j >= 1; j--) {
				if (v[j] <= v[j - 1])
					swap(v, j, j - 1);
				//else
				//	break;
			}
		}	
	}

	public void swap(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

	@Override
	public String getName() {
		return "Insertion";
	}

}
