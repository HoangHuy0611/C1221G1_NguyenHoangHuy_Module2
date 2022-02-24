package ss6_ke_thua.bai_tap.point_vs_moveablepoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{getXSpeed(), getYSpeed()};
    }

    public MoveablePoint move() {
        setX(getX()+getXSpeed());
        setY(getY()+getYSpeed());
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint [" + getX() + ", " + getY() + "]" +
                ", speed=" + Arrays.toString(getSpeed());

    }
}

