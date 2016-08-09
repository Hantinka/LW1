/**
 * Created by Irina on 24.07.2016.
 */
public class Output {
    static void outputArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println("");
    }

    static void outputString(String str){
        System.out.println("My Log => "+str);
    }
}
