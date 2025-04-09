public class Test_Application {
    public static void main(String[] args) throws Exception {
        //documentation specified the creation of a Car and a Bus object through polymorphic
        //referencing, but hasn't specified whether it should be through the interface or the
        //abstract class, so it was done through the interface

        //since documentation hasn't specified whether the object values should be entered by user input
        //or hard-coding, hard-coding has been implemented and matched with the sample output given
        Vehicle vehicle1 = new Car(4, 5, 2, "Car");
        Vehicle vehicle2 = new Bus(35, 6, 4, "Bus", "BOB", "Smith");

        System.out.println(vehicle1);
        System.out.println(vehicle2);
    }
}
