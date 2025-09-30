import java.util.ArrayList;
public class Car {
    private int capacity;
    private ArrayList<Passenger> passengers;

    //constructor
    public Car(int capacity, ArrayList<Passenger> passengers){
        this.capacity = capacity;
        this.passengers = passengers;
    }

    int getCapacity(){
        return capacity;
    }
    int seatsRemaining(){
        return capacity-passengers.size();
    }
    Boolean addPassenger(Passenger p){
        if(passengers.size() == capacity){
            System.out.println("No more passangers are allowed into the car.");
            return false;
        }else {
            passengers.add(p);
            return true;
        }
    }
    Boolean removePassenger(Passenger p){
        if(passengers.size() == 0){
            System.out.println("There are no more passangers in the car.");
            return false;
        }else {
            passengers.remove(p);
            return true;
        }
    }
    void printManifest(){
        System.out.println("MANIFEST\n----------");
        if(passengers.size() != 0){
            System.out.println(passengers);
        } else if (passengers.size() == 0){
            System.out.println("This car is EMPTY");
        }
    }
}