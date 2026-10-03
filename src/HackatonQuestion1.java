import java.util.Scanner;

public class HackatonQuestion1 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        // waste collection vehicle and Suitable Data types;;

        System.out.println("Vehicle number :-  ");
        int vehicleNumber = scr.nextInt();

        System.out.println("Waste collected in kilograms :-  ");
        float wasteInKg = scr.nextFloat();
        if (wasteInKg >= 100) {
            System.out.println("Collection Target Achieved !!");
        } else {
            System.out.println("More Waste Collection Required");
            return;
        }

        System.out.println("Number of collection points :-  ");
        int numberOfCollectionPoints = scr.nextInt();

        System.out.println("Vehicle status  :-  ");
        char vehicleStatus = scr.next().charAt(0);

        // display details :

        System.out.println("----------------------DETAILS----------------------");

        System.out.println("Vehicle number :-  " + vehicleNumber);
        System.out.println("Waste collected in kilograms :-  " + wasteInKg + "KG");
        System.out.println("Number of collection points :-  " + numberOfCollectionPoints);
        System.out.println("Vehicle status  :-  " + vehicleStatus);

        //  If-Else Condition:
        if (wasteInKg >= 100) {
            System.out.println("Collection Target Achieved !!");
        } else {
            System.out.println("More Waste Collection Required");
        }

        //Methods:

        System.out.println("");
        System.out.println("Waste collected at point 1 :- ");
        double point1Waste = scr.nextDouble();

        System.out.println("Waste collected at point 2 :- ");
        double point2Waste = scr.nextDouble();

        // Call the separate method
        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);
        System.out.println("Total waste collected from points: " + totalWaste + " KG");

    }


    public static double calculateTotalWaste(double point1, double point2) {
        return point1 + point2;
    }
}




