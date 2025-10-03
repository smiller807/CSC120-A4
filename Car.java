import java.util.ArrayList;
public class Car {
    private int capacity;
    private ArrayList<Passenger> passengers;

    /**
     * The constructor for the Car class
     * @param capacity is the capacity of passengers for the car
     */
    //constructor
    public Car(int capacity){
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    /**
     * gets the capactity of the car
     * @return prints out the capacity
     */
    int getCapacity(){
        System.out.println("Capacity: " + capacity);
        return capacity;
    }

    /**
     * gets the remainins seays available
     * @return prints the remaining available seats
     */
    int seatsRemaining(){
        System.out.println("\nSeats Remaining: ");
        System.out.println(capacity-passengers.size());
        return capacity-passengers.size();
    }

    /**
     * adds a passenger to the car
     * @param p the passenger being added to the car
     * @return true if the passenger is added and false if the passenger is not
     */
    Boolean addPassenger(Passenger p){
        if(passengers.size() != capacity){
            passengers.add(p);
            return true;
        }else {
            System.out.println("No more passengers are allowed into the car.");
            return false;
        }
    }

    /**
     * removes passenger from the car
     * @param p the passenger being removed from the car
     * @return true if the passenger is removed and false if the passenger is not
     */
    Boolean removePassenger(Passenger p){
        if(passengers.size() == 0){
            System.out.println("There are no more passengers in the car.");
            return false;
        }else {
            passengers.remove(p);
            return true;
        }
    }

    /**
     * prints the nmes of the passengers if the # of passengers is not zero
     * otherwise it prints that the car is empty
     */
    public void printManifest(){
        System.out.println("MANIFEST\n----------");
        if(passengers.size() != 0){
            System.out.println(passengers);
        } else if (passengers.size() == 0){
            System.out.println("This car is EMPTY");
        }
    }

}