public class Cylinder extends Circle {
    // ***CLASS PROPERTIES***
    private double height = 1.0;

    // ***CLASS BEHAVIOURS***
    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBaseArea() {
        return super.getArea(); // since Cylinder is a subclass of Circle, then it has inherited its methods.
                                // so instead of writing duplicate code, just reuse the getBase() method from
                                // Circle superclass, using super since there is also an overridden getArea()
                                // present in Cylinder subclass
    }

    public double getArea() { // since volume and base area are explicitly listed in UML,
                              // getArea() here might refer to surface area and is implemented
        return 2 * 3.14159 * super.getRadius() * this.height + 2 * this.getBaseArea();
    }

    public double getVolume() {
        return this.getBaseArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder Information:\nbase radius=" + super.getRadius() + ", color=" + super.getColor() + ", height="
                + this.height + ", base area=" + this.getBaseArea() + "\nsurface area=" + this.getArea() + ", volume="
                + this.getVolume();
    }
}

