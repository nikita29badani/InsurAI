/* Modified: renamed identifiers to avoid direct copy. Original class: GradeCalculator -> GradeCalculator_Nova2ccb68. Modified on 2025-10-17 */
package Infosys_SpringBoard.JavaExcercises.Conditional_Programs;

public class GradeCalculator_Nova2ccb68 {
    public static void main(String[] args) {
        int score = 85;
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("The grade for a score of " + score + " is: " + grade);
    }
}
