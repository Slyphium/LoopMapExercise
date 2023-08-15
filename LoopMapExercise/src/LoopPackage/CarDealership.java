package LoopPackage;

import java.util.HashMap;
import java.util.Scanner;

public class CarDealership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> vehicleMap = new HashMap<>();
        vehicleMap.put("Civic", "Honda");
        vehicleMap.put("Accord", "Honda");
        vehicleMap.put("Corolla", "Toyota");
        vehicleMap.put("Camry", "Toyota");
        vehicleMap.put("Mustang", "Ford");
        vehicleMap.put("F-150", "Ford");

        System.out.print("What car model are you looking for? ");
        String carModel = scanner.nextLine();
        
        if (vehicleMap.containsKey(carModel)) {
            String carMake = vehicleMap.get(carModel);
            System.out.println("Oh, you're looking for a " + carModel + "? Our " + carMake + " selection is right over here...");
        } else {
            System.out.println("Sorry, we don't have that car model.");
        }

        scanner.close();
    }
}
