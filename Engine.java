public class Engine {
    private FuelType fuelType;
    private double fuelLevel;
    private double maxFuel;

    /**
     * constructor for the Engine class
     * @param fuelType the fuel type the engine is using
     * @param fuelLevel the level the fuel is at
     * @param maxFuel the max the fuel level can be
     */
    //constructor
    public Engine(FuelType fuelType, double fuelLevel, double maxFuel){
        this.fuelType = fuelType;
        this.fuelLevel = fuelLevel;
        this.maxFuel = maxFuel;
    }

    //methods
    /**
     * gets the fuel type
     * @return prints the type of fuel the engine is using
     */
    FuelType getFuelType(){
        System.out.println("Fuel Type: ");
        System.out.println(fuelType);
        return this.fuelType;
    }

    /**
     * gets the max fuel level
     * @return prints the max fuel level
     */
    double getMaxFuel(){
        System.out.println("Max Fuel: ");
        System.out.println(maxFuel);
        return this.maxFuel;
    }

    /**
     * gets the fuel level of the engine
     * @return prints the current fuel level
     */
    double getCurrentFuel(){
        System.out.println("Fuel Level: ");
        System.out.println(fuelLevel);
        return this.fuelLevel;
    }

    /**
     * adds to the amount of fuel the engine has so that the fuel level is at the max level
     */
    void refuel(){
        fuelLevel = maxFuel;
    }

    /**
     * makes the train "go" and the fuel level decreases
     * @return false if the engine reaches 0 true if the fuel is able to continue decreasing
     */
    Boolean go(){
        if (fuelLevel == 0){
            System.out.println("Need to refuel");
            return false;
        } else {
            fuelLevel -= 5;
            return true;
        }
    }

}