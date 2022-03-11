package ss19_string_va_regex.bai_tap.validate_ten_lop_hoc;

public class ClassNameTest {
    private static ClassName className;
    public static final String[] validClassName = new String[]{"C0318G", "A0219H", "P0519M"};
    public static final String[] invalidClassName = new String[]{" M0318G", " P0323A", "S1249P"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String name : validClassName) {
            boolean isvalid = className.validate(name);
            System.out.println("Class name is " + name + "is valid :" + isvalid);
        }
        for (String name : invalidClassName) {
            boolean isvalid = className.validate(name);
            System.out.println("Class name is " + name+ "is valid :" + isvalid);
        }
    }
}
