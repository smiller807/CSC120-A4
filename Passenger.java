public class Passenger {
    private String name;

    /**
     * constructor
     * @param name name of the passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * adds a passenger to the car
     * @param c the car that the passenger is being added to
     */
    void boardCar(Car c){
        c.addPassenger(this);
    }

    /**
     * removes a passenger from the car
     * @param c the car the passenger is being removed from
     */
    void getOffCar(Car c){
        c.removePassenger(this);
    }

    /**
     * overides string for the manifest
     */
    public String toString() {
        return name;
    }
}
