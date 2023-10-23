import java.util.Arrays;
import java.util.Random;

public class Shuffle {

     public static void main(String[] args) {

          Random rand = new Random();
          int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

          for (int i = 0; i < arr.length; i++) {
               int indexswap = rand.nextInt(arr.length);
               int temp = arr[indexswap];
               arr[indexswap] = arr[i];
               arr[i] = temp;
          }
          System.out.println(Arrays.toString(arr));
     }
}
