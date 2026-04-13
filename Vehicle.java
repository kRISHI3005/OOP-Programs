class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

      public Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

       public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}


class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

       public Car(String vehicleNumber, String brand, String fuelType,
               int numberOfSeats, boolean ACavailable) {
        super(vehicleNumber, brand, fuelType); // constructor chaining
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // calling parent method
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car {
    private double batteryCapacity;
    private double chargingTime;

     public ElectricCar(String vehicleNumber, String brand, String fuelType,
                       int numberOfSeats, boolean ACavailable,
                       double batteryCapacity, double chargingTime) {
        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

 class Main {
    public static void main(String[] args) {

               Vehicle v1 = new Vehicle("GJ01AB1234", "Honda", "Petrol");
        System.out.println("\n--- Vehicle Details ---");
        v1.displayDetails();

              Car c1 = new Car("GJ02CD5678", "Hyundai", "Diesel", 5, true);
        System.out.println("\n--- Car Details ---");
        c1.displayDetails();

               ElectricCar e1 = new ElectricCar("GJ03EF9012", "Tesla", "Electric",
                5, true, 75.0, 1.5);
        System.out.println("\n--- Electric Car Details ---");
        e1.displayDetails();

        
        Vehicle v2 = new Car("GJ04GH3456", "Toyota", "Petrol", 7, false);
        System.out.println("\n--- Upcasting (Vehicle reference to Car object) ---");
        v2.displayDetails();

              if (v2 instanceof Car) {
            Car c2 = (Car) v2; // Downcasting
            System.out.println("\nDowncasting successful!");
            System.out.println("Accessing Car-specific property:");
            System.out.println("Number of Seats: " + c2.numberOfSeats);
        }

           if (e1 instanceof ElectricCar) {
            System.out.println("\ne1 is an instance of ElectricCar");
        }
    }
}