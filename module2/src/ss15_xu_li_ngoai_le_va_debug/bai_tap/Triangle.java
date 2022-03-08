package ss15_xu_li_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void createTriangle(double side1, double side2, double side3) throws ILlegalTriangleException {
            throw new ILlegalTriangleException(side1, side2, side3);
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Enter side 1: ");
                double side1 = Double.parseDouble(sc.nextLine());
                System.out.print("Enter side 2: ");
                double side2 = Double.parseDouble(sc.nextLine());
                System.out.print("Enter side 3: ");
                double side3 = Double.parseDouble(sc.nextLine());

                createTriangle(side1, side2, side3);
            } catch (ILlegalTriangleException e) {
                System.err.println(e.getMessage());
            }
        }

    }
