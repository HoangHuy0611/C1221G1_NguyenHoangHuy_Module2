package ss19_string_va_regex.bai_tap.validate_phone_number;

public class PhoneNumber {
    private static final String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)-\\(\\d{10,11}\\)$";
    public static void main(String[] args) {
        String phoneNumber1 ="(84)-(0978489648)";
        String phoneNumber2 = "(a8)-(22222222)";
        boolean check1 = phoneNumber1.matches(PHONE_NUMBER_REGEX);
        System.out.println( phoneNumber1 + check1);
        boolean check2 = phoneNumber2.matches(PHONE_NUMBER_REGEX);
        System.out.println(phoneNumber2 +check2);
    }

}
