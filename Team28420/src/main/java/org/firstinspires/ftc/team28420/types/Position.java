package org.firstinspires.ftc.team28420.types;

public class Position {

    public double x, y;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Position multiply(double k) {
        x *= k;
        y *= k;
        return this;
    }
}