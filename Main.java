import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		Executer executer = new Executer();
		Random rand = new Random();

		Sorting[] strategys = {new SelectionSort(), new InsertionSort(),
		new MergeSort(), new QuickSort()};
		
		try {
			FileWriter writer = new FileWriter("sort.data");
			writer.write("alg time sample\n");
			for (int i = 1000; i <= 20000; i += 1000) {
				int[] values = new int[i];	
				for (int j = 0; j < values.length; j++) {
					values[j] = rand.nextInt(values.length);
				}
				for (int k = 0; k < 4; k++){
					long lStartTime = System.currentTimeMillis();
					executer.executeSortingAlgorithm(strategys[k], values);

					long lEndTime = System.currentTimeMillis();
					long outputTime = lEndTime - lStartTime;
					writer.write(strategys[k].getName() + " " + outputTime + " " + i + "\n");
				}
			}
			writer.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	
	}

}

