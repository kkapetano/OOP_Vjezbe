package Vjezba_3;

import java.text.SimpleDateFormat;

public class Vehicle {
    protected String brand;
    protected String model;
    protected String date;
    protected int vehID;
    protected int autoInc;



    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.date = new String();
        this.vehID = autoInc++;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void startVehicle(){
        System.out.println("Vozilo je pokrenuto!");
    }
    public void stopVehicle(){
        System.out.println("Vozilo je zaustavljeno!");
    }
    protected void vehInfo(){
        System.out.println("Vozilo: " + brand + " " + model + " ID: " + vehID);
    }
    private void additionalMethod(){
        System.out.println("Ovo je dodatna metoda!");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", date=" + date +
                ", vehID=" + vehID +
                ", autoInc=" + autoInc +
                '}';
    }
}
