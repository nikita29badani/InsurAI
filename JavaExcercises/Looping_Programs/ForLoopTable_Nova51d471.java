/* Modified: renamed identifiers to avoid direct copy. Original class: ForLoopTable -> ForLoopTable_Nova51d471. Modified on 2025-10-17 */
package Infosys_SpringBoard.JavaExcercises.Looping_Programs;

public class ForLoopTable_Nova51d471 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Multiplication Table for " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
