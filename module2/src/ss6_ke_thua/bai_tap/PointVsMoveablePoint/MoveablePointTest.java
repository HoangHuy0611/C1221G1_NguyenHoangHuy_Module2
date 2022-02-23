package ss6_ke_thua.bai_tap.PointVsMoveablePoint;

public class MoveablePointTest {
    public static void main(String[] args) {
    MoveablePoint moveablePoint =new MoveablePoint(2.0f,3.0f,1.0f,1.0f);
        System.out.println(moveablePoint);
        MoveablePoint moveablePoint1 =new MoveablePoint(2.0f,3.0f,1.0f,1.0f);
        System.out.println(moveablePoint1);
        moveablePoint1.move();
        System.out.println("MoveablePoint 1 after move" + moveablePoint1);
        System.out.println();

    }
}
