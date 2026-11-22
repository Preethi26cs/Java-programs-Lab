import java.util.Scanner; 

// Interface
interface ParkingCharge {
    void calculateCharge();
    void displayParkingDetails();
}

// Base class
class VehicleParking {
    String vehicleNumber;
    String vehicleType;
    int parkingHours;

    VehicleParking(String number, String type, int hours) {
        vehicleNumber = number;
        vehicleType = type;
        parkingHours = hours;
    }
}

// Two Wheeler class
class TwoWheeler extends VehicleParking implements ParkingCharge {
    double charge;

    TwoWheeler(String number, int hours) {
        super(number, "Two Wheeler", hours);
    }

    public void calculateCharge() {
        if (parkingHours <= 2) {
            charge = parkingHours * 20;
        } else {
            charge = (2 * 20) + (parkingHours - 2) * 10;
        }
    }

    public void displayParkingDetails() {
        calculateCharge();
        System.out.println("\n--- Two Wheeler Parking Details ---");
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Parking Hours : " + parkingHours);
        System.out.println("Total Charge : Rs. " + charge);
    }
}

// Four Wheeler class
class FourWheeler extends VehicleParking implements ParkingCharge {
    double charge;

    FourWheeler(String number, int hours) {
        super(number, "Four Wheeler", hours);
    }

    public void calculateCharge() {
        if (parkingHours <= 2) {
            charge = parkingHours * 50;
        } else {
            charge = (2 * 50) + (parkingHours - 2) * 30;
        }
    }

    public void displayParkingDetails() {
        calculateCharge();
        System.out.println("\n--- Four Wheeler Parking Details ---");
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Parking Hours : " + parkingHours);
        System.out.println("Total Charge : Rs. " + charge);
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Vehicle Type (1-Two Wheeler, 2-Four Wheeler): ");
        int type = sc.nextInt();

        System.out.print("Enter Parking Hours: ");
        int hours = sc.nextInt();

        // Runtime Polymorphism
        ParkingCharge p;

        if (type == 1) {
            p = new TwoWheeler(number, hours);
        } else if (type == 2) {
            p = new FourWheeler(number, hours);
        } else {
            System.out.println("Invalid Vehicle Type!");
            sc.close();
            return;
        }

        p.calculateCharge();
        p.displayParkingDetails();

        sc.close();
    }
}