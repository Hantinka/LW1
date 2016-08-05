/**
 * Created by Irina on 24.07.2016.
 */
class Sorters {
    static void bSort(int[] numbersToSort) {
        for (int j = numbersToSort.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (numbersToSort[i] > numbersToSort[i + 1]) {
                    int temp = numbersToSort[i];
                    numbersToSort[i] = numbersToSort[i + 1];
                    numbersToSort[i + 1] = temp;
                }
            }
        }
    }

    static void shakerSort(int[] numbersToSort) {
        int left = 0;
        int right = numbersToSort.length - 1;
        int permutation = 0;
        do {
            for (int i = left; i < right; i++) {
                if (numbersToSort[i] > numbersToSort[i + 1]) {
                    numbersToSort[i] ^= numbersToSort[i + 1];
                    numbersToSort[i + 1] ^= numbersToSort[i];
                    numbersToSort[i] ^= numbersToSort[i + 1];
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (numbersToSort[i] < numbersToSort[i - 1]) {
                    numbersToSort[i] ^= numbersToSort[i - 1];
                    numbersToSort[i - 1] ^= numbersToSort[i];
                    numbersToSort[i] ^= numbersToSort[i - 1];
                }
            }
            left++;
        } while (left <= right);
    }

    static void insSort(int[] numbersToSort) {
        for (int i = 1; i < numbersToSort.length; i++) {
            int temp = numbersToSort[i];
            int j;
            for (j = i - 1; j >= 0 && temp < numbersToSort[j]; j--)
                numbersToSort[j + 1] = numbersToSort[j];
            numbersToSort[j + 1] = temp;
        }
    }

    static void shellSort(int[] numbersToSort) {
        int increment = numbersToSort.length / 2;
        while (increment > 0) {
            for (int i = increment; i < numbersToSort.length; i++) {
                int j = i;
                int temp = numbersToSort[i];
                while (j >= increment && numbersToSort[j - increment] > temp) {
                    numbersToSort[j] = numbersToSort[j - increment];
                    j = j - increment;
                }
                numbersToSort[j] = temp;
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }
    }
}