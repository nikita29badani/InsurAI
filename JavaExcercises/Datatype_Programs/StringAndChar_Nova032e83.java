/* Modified: renamed identifiers to avoid direct copy. Original class: StringAndChar -> StringAndChar_Nova032e83. Modified on 2025-10-17 */
package Infosys_SpringBoard.JavaExcercises.Datatype_Programs;

public class StringAndChar_Nova032e83 {
    public static void main(String[] args) {
        char grade = 'A';
        char currency = '$';

        String greeting = "Hello, World!";
        String name = "Karlo";

        String message = "My name is " + name + ".";

        System.out.println("Grade: " + grade);
        System.out.println("Greeting: " + greeting);
        System.out.println(message);

        char firstLetter = name.charAt(0);
        System.out.println("The first letter of " + name + " is " + firstLetter);
    }
}
