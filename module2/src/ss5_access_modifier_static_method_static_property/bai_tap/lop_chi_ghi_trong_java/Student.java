package ss5_access_modifier_static_method_static_property.bai_tap.lop_chi_ghi_trong_java;

public class Student {
    private String name = "John";
    private String className = "C02";

    Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }
}
