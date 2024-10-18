import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int sizeOfArray = in.nextInt();

        int[] array1 = new int[sizeOfArray];

        System.out.print("Enter " + sizeOfArray + " value: ");
        for (int i = 0; i < sizeOfArray; i++) {
            array1[i] = in.nextInt();
        }

        for (int i = 0; i < sizeOfArray; i++) {
            int sum = 0;
            for (int number = 1; number < array1[i]; number++) {
                if (number % 3 == 0 || number % 5 == 0) {
                    sum += number;
                }
            }
            System.out.println(sum);
        }
    }

}
