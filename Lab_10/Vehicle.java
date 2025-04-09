public interface Vehicle {
    //***PROPERTIES***
    //no properties according to documentation

    //***BEHAVIOURS***

    //all behaviours have been italicised, meaning they are meant to be abstract,
    //but since all interface methods are abstract by default there is no need to
    //add the abstract keyword
    public int getNumberOfSeats();
    public int getNumberOfWheels();
    public String getVehicleType();
}
