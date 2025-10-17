/* Modified: renamed identifiers to avoid direct copy. Original class: FindLargestElement -> FindLargestElement_Novada90e3. Modified on 2025-10-17 */
package Infosys_SpringBoard.JavaExcercises.Array_Programs;

public class FindLargestElement_Novada90e3 {
    public static void main(String[] args) {
        int[] numbers = {25, 11, 7, 75, 56, 98, 42};

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The largest number in the array is: " + max);
    }
}
