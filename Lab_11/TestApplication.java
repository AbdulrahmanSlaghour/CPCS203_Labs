public class TestApplication {
    public static void main(String[] args) {
        // Create a SimpleGeneric object with String type
        SimpleGeneric<String> stringObj = new SimpleGeneric<>("Hello Generic");
        stringObj.print();
        stringObj.printType();

        // Create a SimpleGeneric object with Double type
        SimpleGeneric<Double> doubleObj = new SimpleGeneric<>(5.5);
        doubleObj.print();
        doubleObj.printType();
    }
}
