package org.example;

public class Main {

    public static void printAirplaneInfo(String modelName, String airplaneType) {
        System.out.println("Тип самолета: " + airplaneType + ", модель: " + modelName);
    }

    public static void printAirplaneInfo(String modelName, String airplaneType, int economySeats) {
        System.out.println("Тип самолета: " + airplaneType + ", модель: " + modelName + ", кол. пассажиров эконом класса: " + economySeats);
    }

    public static void printAirplaneInfo(String modelName, String airplaneType, int economySeats, int businessSeats) {
        System.out.println("Тип самолета: " + airplaneType + ", модель: " + modelName + ", кол. пассажиров эконом класса: " + economySeats + ", пассажиров бизнес класса: " + businessSeats);
    }

    public static void main(String[] args) {
        printAirplaneInfo("F-22 Raptor", "Jet");
        printAirplaneInfo("Aerobus 737", "Airliner", 120);
        printAirplaneInfo("Boeing 777", "Airliner", 180, 28);
    }
}
