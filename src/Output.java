/**
 * Created by Irina on 24.07.2016.
 */
public class Output {
    static void output(int[] numbersToSort) {
        for (int j = 0; j < numbersToSort.length; j++) {
        System.out.print(numbersToSort[j] + " ");
        }
        System.out.println("");
    }
    static void output2(int[] numbersToSort) {
        for (int i : numbersToSort)
        System.out.print(i + " ");
        }
    }
