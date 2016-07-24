/**
 * Created by Irina on 24.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = ReadFromFile.readSort("input.txt");
        int[] numbers2 = ReadFromFile.readSort("input2.txt");
        Sorters.bSort(numbers);
        Sorters.ShakerSort( numbers2);
        Output.output(numbers);
        Output.output2(numbers2);
    }
}
