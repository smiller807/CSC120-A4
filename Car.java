public class Car {
    private int maxPeople;
    private int numOfSeats;
    private int numOfPeople;

    //constructor
    public Car(int maxPeople, int numOfSeats, int nomOfPeople){
        this.maxPeople = maxPeople;
        this.numOfSeats = numOfSeats;
        this.numOfPeople = numOfPeople;
    }

    int getCapacity(){
        return numOfSeats;
    }
    int seatsRemaining(){
        return numOfSeats-numOfPeople;
    }
    Boolean addPassenger(Passenger p){
        if(numOfPeople == maxPeople){
            System.out.println("No more passangers are allowed into the car.");
        }else {
            numOfPeople += 1;
        }
    }
    Boolean removePassenger(Passenger p){
        if(numOfPeople == 0){
            System.out.println("There are no more passangers in the car.");
        }else {
            numOfPeople -= 1;
        }
    }
    void printManifest(){
        System.out.println("MANIFEST\n----------");
        System.out.println(numOfPeople);
        System.out.println(Passenger p);
    }
}