public class Aufgabe5 {
    public static void main (String [] args) {
        int [][] arr1D = new int [10][];
        for (int i = 0; i < arr1D.length; i = i + 1){
            for (int j = 0; j <= i; j = j + 1){
                arr1D [i] [j] = j;
            }
        }

    }
    
}
