public abstract class basicVehicle implements Vehicle {
    //***PROPERTIES***
    //no inheritted properties from interface: Vehicle

    private int noOfWheels;
    private int NoOfSeats;
    private int noOfDoors;
    private String type;

    //***BEHAVIOURS***
    //some behaviours inheritted from interface: Vehicle

    public basicVehicle(int noOfWheels, int NoOfSeats, int noOfDoors, String type) {
        this.noOfWheels = noOfWheels;
        this.NoOfSeats = NoOfSeats;
        this.noOfDoors = noOfDoors;
        this.type = type;
    }
    
    //since the getters from the interface Vehicle relate to the properties of this
    //class basicVehicle, they will be implementted concretelly here
    public int getNumberOfSeats() {
        return this.NoOfSeats;
    }

    public int getNumberOfWheels() {
        return this.noOfWheels;
    }

    public String getVehicleType() {
        return this.type;
    }

    //below getter is listed under basicVehicle class, unlike the rest of the getters from interface: Vehicle
    public int getNumberOfDoors() {
        return noOfDoors;
    }

    public String toString() {
        return "Type: " + this.type + "\n# Of Wheels: " + this.noOfWheels + "\n# of Seats: " + this.NoOfSeats + "\n# of Doors: " + this.noOfDoors;
    }
}
