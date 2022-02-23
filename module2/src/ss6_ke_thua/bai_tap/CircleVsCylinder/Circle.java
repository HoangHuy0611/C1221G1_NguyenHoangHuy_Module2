package ss6_ke_thua.bai_tap.CircleVsCylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + this.getRadius() +
                ", color=" + this.getColor() + ".";
    }
}