public class SimpleGeneric<T> {
    private T obj;

    // Default constructor
    public SimpleGeneric() {
    }

    // Constructor with parameter
    public SimpleGeneric(T param) {
        this.obj = param;
    }

    // Setter method
    public void setObjReff(T obj) {
        this.obj = obj;
    }

    // Getter method
    public T getObjReff() {
        return obj;
    }

    // Method to print the object
    public void print() {
        System.out.println("Object: " + obj);
    }

    // Method to print the type of the object
    public void printType() {
        System.out.println("Type: " + obj.getClass().getName());
    }
}
