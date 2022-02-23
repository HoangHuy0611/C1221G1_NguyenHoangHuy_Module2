package ss6_ke_thua.bai_tap.CircleVsCylinder;

public class Cylinder extends Circle {
    private double height = 5.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * this.getRadius() * (this.getRadius() + this.getHeight());
    }

    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * getHeight();
    }

    @Override
    public String toString() {
        return "A Cylinder with height=" + this.getHeight() + ", which is a subclass of "
                + super.toString();
    }
}
