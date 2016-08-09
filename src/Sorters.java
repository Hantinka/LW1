/**
 * Created by Irina on 24.07.2016.
 */
class Sorters {
    static void bSort(int[] numbersToSort) {
        int compare = 0;
        int swap = 0;
        for (int j = numbersToSort.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (numbersToSort[i] > numbersToSort[i + 1]) {
                    int temp = numbersToSort[i];
                    numbersToSort[i] = numbersToSort[i + 1];
                    numbersToSort[i + 1] = temp;
                    swap++;
                }
                compare++;
            }
        }
        Output.outputString("Bsort => Сравнений: " + compare + " Перестановок: " + swap );
    }

    static void shakerSort(int[] numbersToSort) {
        int compare = 0;
        int swap = 0;
        int left = 0;
        int right = numbersToSort.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (numbersToSort[i] > numbersToSort[i + 1]) {
                    numbersToSort[i] ^= numbersToSort[i + 1];
                    numbersToSort[i + 1] ^= numbersToSort[i];
                    numbersToSort[i] ^= numbersToSort[i + 1];
                    swap++;
                }
                compare++;
            }
            right--;
            for (int i = right; i > left; i--) {
                if (numbersToSort[i] < numbersToSort[i - 1]) {
                    numbersToSort[i] ^= numbersToSort[i - 1];
                    numbersToSort[i - 1] ^= numbersToSort[i];
                    numbersToSort[i] ^= numbersToSort[i - 1];
                    swap++;
                }
                compare++;
            }
            left++;
        } while (left <= right);
        Output.outputString("shakerSort => Сравнений: " + compare + " Перестановок: " + swap );
    }

    static void insSort(int[] numbersToSort) {
        int compare = 0;
        int swap = 0;
        int i, j, temp;
        for (i = 1; i < numbersToSort.length; i++) {
            temp = numbersToSort[i];
            j = i;
            int jtemp = j;
            while (jtemp > 0) {
                compare++;
                jtemp--;
            }
                while (j > 0 && numbersToSort[j - 1] > temp) { // j == 2; && 85 > 19 => true // j == 1; 74 > 19
                    numbersToSort[j] = numbersToSort[j - 1];  // 19 <=> 85
                    j--; // j = 1;
                    swap++;
                    // только то что попадает под условие перестановки
                }
                numbersToSort[j] = temp; // j == 1;
                // считает вобще все что происходит в цикле
                //compare++;
            }
        Output.outputString("insSort => Сравнений: " + compare + " Перестановок: " + swap);

    }

    static void shellSort(int[] numbersToSort) {
        int compare = 0;
        int swap = 0;
        int increment = numbersToSort.length / 2;
        while (increment > 0) {
            for (int i = 0; i < (numbersToSort.length - increment); i++) {
                int j = i;
                int jtemp = j;
                while (jtemp > 0) {
                    compare++;
                    jtemp--;
                }
                while ((j >= 0) && (numbersToSort[j] > numbersToSort[j + increment])) {
                    int temp = numbersToSort[j];
                    numbersToSort[j] = numbersToSort[j + increment];
                    numbersToSort[j + increment] = temp;
                    j--;
                    swap++;
                }
            }
            //System.out.println("increment = " + increment);
            increment = increment/2;
        }
        Output.outputString("shellSort => Сравнений: " + compare + " Перестановок: " + swap );
    }
}
