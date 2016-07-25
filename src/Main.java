/**
 * Created by Irina on 24.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = ReadFromFile.readSort("input.txt");
        int[] numbers2 = ReadFromFile.readSort("input2.txt");
        int[] numbers3 = ReadFromFile.readSort("input3.txt");
        int[] numbers4 = ReadFromFile.readSort("input4.txt");
        Sorters.bSort(numbers);
        Sorters.shakerSort( numbers2);
        Sorters.insSort(numbers3);
        Sorters.shellSort(numbers4);
        Output.output(numbers);
        Output.output(numbers2);
        Output.output(numbers3);
        Output.output(numbers4);
    }
}
