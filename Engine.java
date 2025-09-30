public class Engine {
    private FuelType fuelType;
    private double fuelLevel;
    private int maxFuel;

    //constructor
    public Engine(FuelType fuelType, double fuelLevel, int maxFuel){
        this.fuelType = fuelType;
        this.fuelLevel = fuelLevel;
        this.maxFuel = maxFuel;
    }
    //methods
    FuelType getFuelType(){
        return this.fuelType;
    }
    double getMaxFuel(int maxFuel){
        return this.maxFuel;
    }
    double getCurrentFuel(double fuelLevel){
        return this.fuelLevel;
    }
    void refuel(double fuelLevel, int maxFuel){
        fuelLevel = maxFuel;
    }
    Boolean go(double fuelLevel){
        if (fuelLevel == 0){
            System.out.println("Need to refuel");
        } else {
            fuelLevel -= 5;
        }
        return null;
    }

}