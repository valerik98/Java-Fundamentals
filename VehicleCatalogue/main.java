package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Vehicle> vehicleList = new ArrayList<>();

        while (!input.equals("End")) {
            String typeOfVehicle = input.split(" ")[0];
            String modelOfVehicle = input.split(" ")[1];
            String colorOfVehicle = input.split(" ")[2];
            int horsepowerOfVehicle = Integer.parseInt(input.split(" ")[3]);

            Vehicle vehicle = new Vehicle(typeOfVehicle, modelOfVehicle, colorOfVehicle, horsepowerOfVehicle);
            vehicleList.add(vehicle);

            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getModelOfVehicle().equals(input)) {
                    //Type: {typeOfVehicle} Model: {modelOfVehicle} Color: {colorOfVehicle} Horsepower: {horsepowerOfVehicle}
                    System.out.println("Type: " + vehicle.getTypeOfVehicle());
                    System.out.println("Model: " + vehicle.getModelOfVehicle());
                    System.out.println("Color: " + vehicle.getColorOfVehicle());
                    System.out.println("Horsepower: " + vehicle.getHorsepowerOfVehicle());
                }
            }

            input = scanner.nextLine();
        }
        double sumOfCars = 0;
        int countCars = 0;
        double sumOfTrucks = 0;
        int countTrucks = 0;

        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getTypeOfVehicle().equals("truck")) {
                sumOfTrucks += vehicle.getHorsepowerOfVehicle();
                countTrucks ++;
            } else if (vehicle.getTypeOfVehicle().equals("car")) {
                sumOfCars += vehicle.getHorsepowerOfVehicle();
                countCars ++;
            }
        }
        double averageSumOfTrucks = sumOfTrucks/countTrucks;
        if (countTrucks == 0){
            averageSumOfTrucks = 0;
        }
        double averageSumOfCars = sumOfCars/countCars;
        if (countCars == 0){
            averageSumOfCars = 0;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n",averageSumOfCars);
        System.out.printf("Trucks have average horsepower of: %.2f.%n",averageSumOfTrucks);


    }
}
