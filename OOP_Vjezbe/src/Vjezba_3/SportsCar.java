package Vjezba_3;

public class SportsCar {
    private String brand;
    private String model;
    private String type;


    public SportsCar(String brand, String model,String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;

    }
    public void startVehicle(){
        System.out.println("Sportski automobil je pokrenut!");
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void vehInfo() {
        System.out.println("Sportski automobil: " + brand + " " + model + " " + type);
    }
}
