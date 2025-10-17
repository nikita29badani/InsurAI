/* Modified: renamed identifiers to avoid direct copy. Original class: TypeCasting -> TypeCasting_Nova2c2c0b. Modified on 2025-10-17 */
package Infosys_SpringBoard.JavaExcercises.Datatype_Programs;

public class TypeCasting_Nova2c2c0b {
    public static void main(String[] args) {
        int Int = 9;
        double Double = Int;

        System.out.println("--- Widening Casting ---");
        System.out.println("Original int: " + Int);
        System.out.println("Casted double: " + Double);

        double twoDouble = 9.78;
        int twoInt = (int)twoDouble;

        System.out.println("\n--- Narrowing Casting ---");
        System.out.println("Original double: " + twoDouble);
        System.out.println("Casted int (data loss): " + twoInt);
    }
}
