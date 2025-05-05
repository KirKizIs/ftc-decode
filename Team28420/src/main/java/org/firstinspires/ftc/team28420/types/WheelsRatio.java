package org.firstinspires.ftc.team28420.types;

import java.lang.Number;

public class WheelsRatio<T extends Number> {

    private T leftFront, rightFront, leftBack, rightBack;

    public T getLeftFront() {
        return leftFront;
    }

    public void setLeftFront(T leftFront) {
        this.leftFront = leftFront;
    }

    public T getRightFront() {
        return rightFront;
    }

    public void setRightFront(T rightFront) {
        this.rightFront = rightFront;
    }

    public T getLeftBack() {
        return leftBack;
    }

    public void setLeftBack(T leftBack) {
        this.leftBack = leftBack;
    }

    public T getRightBack() {
        return rightBack;
    }

    public void setRightBack(T rightBack) {
        this.rightBack = rightBack;
    }

    public WheelsRatio(T leftFront, T rightFront, T leftBack, T rightBack) {
        this.leftFront = leftFront;
        this.rightFront = rightFront;
        this.leftBack = leftBack;
        this.rightBack = rightBack;
    }

    public static final WheelsRatio<Double> ZERO = new WheelsRatio(0, 0, 0, 0);

    public WheelsRatio<Integer> toInt(double k) {
        return new WheelsRatio<>(
                (int) ((double) leftFront * k),
                (int) ((double) rightFront * k),
                (int) ((double) leftBack * k),
                (int) ((double) rightBack * k)
        );
    }

    @Override
    public String toString() {
        return "WheelsRatio{" +
                "leftFront=" + leftFront +
                ", rightFront=" + rightFront +
                ", leftBack=" + leftBack +
                ", rightBack=" + rightBack +
                '}';
    }
}
