
import java.util.Arrays;

public class Aufgabe5 {

    public static void main (String [] args) {
        int [][] arr1D = new int [10][];
        for (int i = 0; i < arr1D.length; i = i + 1){
            int [] arr2D = new int [i+1];
            for (int j = 0; j <= i; j = j + 1){
                arr2D [j] = j;
            }
        arr1D[i] = arr2D;
        System.out.println(Arrays.toString(arr1D[i]));
        }

    }
    
}
