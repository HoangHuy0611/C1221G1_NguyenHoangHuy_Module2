package ss7_abstract_class_va_interface.bai_tap.interface_resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 6);
        shapes[2] = new Square(5);
        System.out.println("Pre-Resize: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        for (Shape shape : shapes) {
            ((Resizeable) shape).resize(6);
        }
        System.out.println("After-Resized: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
