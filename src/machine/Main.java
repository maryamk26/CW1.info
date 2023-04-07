package machine;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LIST catalog = new LIST();

        // Add sample cars to the catalog
        catalog.addCar(new CARS(new SPECS("sedan", "ICE-gas", "automatic", "red"), "Toyota Camry", 25000, 5, 130, 30));
        catalog.addCar(new CARS(new SPECS("hatchback", "electric", "manual", "blue"), "Tesla Model 3", 40000, 5, 140, 4));
        catalog.addCar(new CARS(new SPECS("minivan", "hybrid", "automatic", "gray"), "Toyota Sienna", 35000, 7, 120, 28));
        catalog.addCar(new CARS(new SPECS("coupe", "ICE-gas", "manual", "black"), "Honda Civic Type R", 35000, 4, 170, 22));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter car specifications:");
            System.out.println("----------------------------");
            System.out.print("Body type: ");
            String bodyType = scanner.nextLine().trim();
            System.out.println("----------------------------");
            System.out.print("Engine type: ");
            String engineType = scanner.nextLine().trim();
            System.out.println("----------------------------");
            System.out.print("Transmission: ");
            String transmission = scanner.nextLine().trim();
            System.out.println("----------------------------");
            System.out.print("Color: ");
            String color = scanner.nextLine().trim();
            System.out.println("----------------------------");

            List<CARS> matchingCars = catalog.searchlist(new SPECS(bodyType, engineType, transmission, color));

            if (matchingCars.isEmpty()) {
                System.out.println("No matching cars found.");
            } else {
                System.out.println("Matching cars:");
                for (CARS car : matchingCars) {
                    System.out.println(car.toString());
                }
            }
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            } else {
                break;
            }
        }
    }
}