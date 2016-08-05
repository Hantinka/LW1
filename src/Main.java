/**
 * Created by Irina on 24.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        // 1
        int[] numbers = ReadFromFile.readSort("input.txt");
        int[] numbers2 = ReadFromFile.readSort("input2.txt");
        int[] numbers3 = ReadFromFile.readSort("input3.txt");
        int[] numbers4 = ReadFromFile.readSort("input4.txt");
        // 1
        // 2
        Sorters.bSort(numbers);
        Sorters.shakerSort( numbers2);
        Sorters.insSort(numbers3);
        Sorters.shellSort(numbers4);
        // 2
        // 3
        Output.output(numbers);
        Output.output(numbers2);
        Output.output(numbers3);
        Output.output(numbers4);
        OutputFile.writeSort("output.txt",numbers);
        OutputFile.writeSort("output2.txt",numbers2);
        OutputFile.writeSort("output3.txt",numbers3);
        OutputFile.writeSort("output4.txt",numbers4);
        //3
    }
}
