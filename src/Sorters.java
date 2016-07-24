/**
 * Created by Irina on 24.07.2016.
 */
class Sorters {
    static void bSort(int [] numbersToSort){
        for (int j = numbersToSort.length-1; j>0; j--){
            for (int i = 0; i<j; i++){
                if (numbersToSort[i]>numbersToSort[i+1]){
                    int temp=numbersToSort[i];
                    numbersToSort[i]=numbersToSort[i+1];
                    numbersToSort[i+1]=temp;
                }
            }
        }
        }
    static void ShakerSort (int [] numbersToSort) {
        int left = 0;
        int right = numbersToSort.length - 1;
        do
        {
            for (int i = left; i < right; i++)
            {
                if(numbersToSort[i] > numbersToSort[i+1])
                {
                    numbersToSort[i] ^= numbersToSort[i+1];
                    numbersToSort[i+1] ^= numbersToSort[i];
                    numbersToSort[i] ^= numbersToSort[i+1];
                }
            }
            right--;
            for (int i = right; i > left ; i--)
            {
                if(numbersToSort[i] < numbersToSort[i-1])
                {
                    numbersToSort[i] ^= numbersToSort[i-1];
                    numbersToSort[i-1] ^= numbersToSort[i];
                    numbersToSort[i] ^= numbersToSort[i-1];
                }
            }
            left++;
        } while (left <= right);
    }
}
