import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Irina on 24.07.2016.
 */
class ReadFromFile {
    static int[] readSort(String filename) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int i = 0;
        int[] numbersToSort;
        numbersToSort = new int[6];
        while (scanner.hasNextInt()) numbersToSort[i++] = scanner.nextInt();
        scanner.close();
        return numbersToSort;
    }
}