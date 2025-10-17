/* Modified: renamed identifiers to avoid direct copy. Original class: Dog -> Dog_Novab86686. Modified on 2025-10-17 */
class Dog_Novab86686 {
    String breed;
    int age;

    void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class SimpleObject {
    public static void main(String[] args) {
        Dog_Novab86686 myDog = new Dog_Novab86686();

        myDog.breed = "Golden Retriever";
        myDog.age = 5;

        System.out.println("My dog is a " + myDog.breed);
        System.out.println("It is " + myDog.age + " years old.");

        myDog.bark();
    }
}
