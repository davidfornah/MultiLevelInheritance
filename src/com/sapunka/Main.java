package com.sapunka;

public class Main {
    public static class MultilevelInheritance {
    public static void main(String[] args) {

    Vehicle vehicle = new Vehicle();
    vehicle.printVehicle();

    Lorry lo = new Lorry();
    lo.printLorry();

    Car ca = new Car();
    ca.printCar();
        }
    }

    static class Vehicle{
    public void printVehicle(){
        System.out.println("\nPLEASE PRINT THE TYPES OF VEHICLES IN THE STREET.");
        }
    }

    static class Lorry extends Vehicle{
    public void printLorry() {
    System.out.println("There are LORRIES in the street and also,");
        }
    }

    static class Car extends Lorry{
    public void printCar(){
    System.out.println("CARS in the street at the moment.\n");
        }
    }
}
