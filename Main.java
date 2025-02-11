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
			for (int i = 1000; i <= 10000; i += 1000) {
				int[] values = new int[i];	
				for (int j = 0; j < values.length; j++) {
					values[j] = rand.nextInt(1000);
				}
				for (int k = 0; k < 4; k++){
					long[] outputTimes = new long[30];
					for (int l = 0; l < 30; l++) {
						long lStartTime = System.nanoTime();
						executer.executeSortingAlgorithm(strategys[k], values);
						long lEndTime = System.nanoTime();
						long outputTime = lEndTime - lStartTime;
						outputTimes[l] = outputTime;
						Arrays.sort(outputTimes);
					}
					writer.write(strategys[k].getName() + " " + outputTimes[15]/1000000 + " " + i + "\n");
				}
			}
			writer.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	
	}

}

