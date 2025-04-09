public class Car extends basicVehicle{
    //***PROPERTIES***
    //no inheritted properties

    //***BEHAVIOURS***
    //some inheritted methods from super-class: basicVehicle

    //all needed abstract methods from interface Vehicle are already implemented in basicVehicle
    //and inheritted from it

    public Car(int noOfWheels, int NoOfSeats, int noOfDoors, String type) {
        super(noOfWheels, NoOfSeats, noOfDoors, type);
    }
}
