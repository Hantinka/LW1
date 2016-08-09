import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Created by Irina on 05.08.2016.
 */
public class OutputFile {
    static void writeSort(String filename, int[] numbersToWrite){
        try {
            FileWriter writer = new FileWriter(new File(filename));
            writer.write(numbersToWrite.length + "\n");
            for (int j = 0; j < numbersToWrite.length; j++)
            writer.write(numbersToWrite[j] + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }

