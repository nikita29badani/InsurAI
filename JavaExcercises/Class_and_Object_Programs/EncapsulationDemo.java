/* Modified: renamed identifiers to avoid direct copy. Original class: Car -> Car_Novabc47a3. Modified on 2025-10-17 */
package Infosys_SpringBoard.JavaExcercises.Class_and_Object_Programs;

class Car_Novabc47a3 {
    private String make;
    private String model;
    private int year;

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Car_Novabc47a3 myCar = new Car_Novabc47a3();

        myCar.setMake("Toyota");
        myCar.setModel("Camry");
        myCar.setYear(2022);

        System.out.println("Car_Novabc47a3 Make: " + myCar.getMake());
        System.out.println("Car_Novabc47a3 Model: " + myCar.getModel());
        System.out.println("Car_Novabc47a3 Year: " + myCar.getYear());
    }
}
