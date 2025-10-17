/* Modified: renamed identifiers to avoid direct copy. Original class: RelationalLogicalOperators -> RelationalLogicalOperators_Novaa98336. Modified on 2025-10-17 */
package Infosys_SpringBoard.JavaExcercises.Arithmetic_Operators_Programs;

public class RelationalLogicalOperators_Novaa98336 {
    public static void main(String[] args) {
        int age = 25;
        boolean hasLicense = true;

        System.out.println("Is age greater than 18? " + (age > 18));
        System.out.println("Is age equal to 25? " + (age == 25));

        if (age >= 18 && hasLicense) {
            System.out.println("You are eligible to drive.");
        }

        int hour = 14;
        if (hour < 9 || hour > 17) {
            System.out.println("The office is closed.");
        }
    }
}
