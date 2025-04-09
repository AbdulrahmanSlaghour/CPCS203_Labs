public class Bus extends basicVehicle{
    //***PROPERTIES***
    //no inheritted properties

    private String driverName;

    //***BEHAVIOURS***
    //some inheritted methods from super-class: basicVehicle

    //all needed abstract methods from interface Vehicle are already implemented in basicVehicle
    //and inheritted from it

    public Bus(int noOfWheels, int NoOfSeats, int noOfDoors, String type, String driverFname, String driverLName) {
        super(noOfWheels, NoOfSeats, noOfDoors, type);
        this.driverName = driverFname +" "+ driverLName;
    }

    //since documentation specified setDriverName() to be private, that is why it is
    private void setDriverName(String driverFName, String driverLName) {
        this.driverName = driverFName + driverLName;
    }

    public String getDriverName() {
        return this.driverName;
    }

    public String toString() {
        return super.toString() + "\nDriver: " + driverName;
    }
}