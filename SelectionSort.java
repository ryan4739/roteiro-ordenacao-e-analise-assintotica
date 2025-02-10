public class SelectionSort implements Sorting {

	@Override
	public void sort(int[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			int i_min = i;
			for (int j = i; j <= v.length - 1; j++){
				if (v[j] <= v[i_min])
					i_min = j;
			}
			swap(v, i, i_min);
		}		
	}

	public void swap(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
	
	@Override
	public String getName() {
		return "Selection";
	}

}
