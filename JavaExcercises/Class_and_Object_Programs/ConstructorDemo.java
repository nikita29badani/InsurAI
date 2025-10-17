/* Modified: renamed identifiers to avoid direct copy. Original class: Student -> Student_Nova42b327. Modified on 2025-10-17 */
package Infosys_SpringBoard.JavaExcercises.Class_and_Object_Programs;

class Student_Nova42b327 {
    String name;
    int rollNumber;
    
    Student_Nova42b327(String studentName, int studentRoll) {
        name = studentName;
        rollNumber = studentRoll;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Student_Nova42b327 student1 = new Student_Nova42b327("Alice", 101);
        Student_Nova42b327 student2 = new Student_Nova42b327("Bob", 102);

        student1.displayInfo();
        student2.displayInfo();
    }
}
