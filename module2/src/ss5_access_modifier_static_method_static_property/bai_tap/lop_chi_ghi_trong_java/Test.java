package ss5_access_modifier_static_method_static_property.bai_tap.lop_chi_ghi_trong_java;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Class: " + s1.getClassName());
        System.out.println("Name: " + s1.getName());
        s1.setName("Huy");
        s1.setClassName("C12");
        System.out.println("Class: " + s1.getClassName());
        System.out.println("Name: " + s1.getName());
        System.out.println("to string: " + s1);
    }
}
