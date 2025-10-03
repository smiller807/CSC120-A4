import java.util.ArrayList;
public class Train {
    private FuelType fuelType;
    private double currentFuelLevel;
    private double fuelCapacity;
    private int nCars;
    private int passengerCapacity;

    private Engine engine;
    private ArrayList<Car> cars;

    /**
     * constructor
     * @param fuelType the fuel the train is using
     * @param currentFuelLevel the fuel level of the train
     * @param fuelCapacity the max fuel level of the train
     * @param nCars the # of cars the train has
     * @param passengerCapacity the max amount of passengers the train can have
     */
    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, 
    int nCars, int passengerCapacity){
        this.fuelType = fuelType;
        this.currentFuelLevel = currentFuelLevel;
        this.fuelCapacity = fuelCapacity;
        this.nCars = nCars;
        this.passengerCapacity = passengerCapacity;

        this.engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        this.cars = new ArrayList<>();

        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

    /**
     * gets the engine
     * @return prints the engine that is initialized
     */
    public Engine getEngine(){
        return this.engine;
    }

    /**
     * gets the car
     * @param i the number of can that is being called
     * @return if int i is within the index of cars it prints the corrisponding car if not then it says that it is invalid
     */
    public Car getCar(int i){
        if (i >= 0 && i < cars.size()) {
            return cars.get(i);
        } else {
            System.out.println("Invalid car index: " + i);
            return null;
        }
    }

    /**
     * get max capacity
     * @return gets the max capacity of the cars
     */
    public int getMaxCapacity(){
        int total = 0;
        for (Car car : cars) {
            total += car.getCapacity();
        }
        return total;
    }

    /**
     * gets the amount of seats remaining on the train
     * @return the total amount of seats available
     */
    public int seatsRemaining(){
        int total = 0;
        for (Car car : cars) {
            total += car.seatsRemaining();
        }
        return total;
    }

    /**
     * prints the manifest for each car on the train
     */
    public void printManifest(){
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + i + ":");
            cars.get(i).printManifest();
            System.out.println(); // spacing between cars
        }
    } 

    //main method
    public static void main(String[] args) {
        FuelType fuel = FuelType.ELECTRIC;
        Train train = new Train(fuel ,100, 100, 2, 10);
        Car car = new Car(10);
        Passenger p = new Passenger("Sarah");
        Passenger pass = new Passenger("Emma");
        
        p.boardCar(car);
        car.addPassenger(pass);
        car.seatsRemaining();

        train.getMaxCapacity();
    }
}
