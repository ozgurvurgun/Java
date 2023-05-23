package basics;
import java.text.Normalizer.Form;

import javax.imageio.stream.FileImageOutputStream;

public class Loops {
    public static void main(String[] args) {
        // for loop
        int[] myNumbers = { 12, 15, 36, 47, 81 };
        // int x = myNumbers[0] / 3 * 5;
        // System.out.println(x);
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println((i + 1) + ". deger: " + myNumbers[i]);
        }

        // forin
        for (int number : myNumbers) {
            System.out.println(number + "\n-------------");
        }

        // while
        int j = 0;
        while (j < 10) {
            System.out.println("test");
            j++;
        }
    }
}
