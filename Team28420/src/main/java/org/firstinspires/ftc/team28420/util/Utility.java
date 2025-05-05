package org.firstinspires.ftc.team28420.util;

import org.firstinspires.ftc.team28420.types.PolarVector;
import org.firstinspires.ftc.team28420.types.Position;
import org.firstinspires.ftc.team28420.types.WheelsRatio;

public class Utility {

    public static PolarVector getVectorFromPos(Position pos) {
        return new PolarVector(Math.atan2(pos.y, pos.x), Math.hypot(pos.x, pos.y));
    }

    public WheelsRatio<Double> getTheta(PolarVector vector, double turn) {
        double sin = Math.sin(vector.getTheta() - Math.PI / 4);
        double cos = Math.cos(vector.getTheta() - Math.PI / 4);
        double max = Math.max(Math.abs(sin), Math.abs(cos));

        double lf = vector.getAbs() * cos / max + turn;
        double rf = vector.getAbs() * sin / max - turn;
        double lb = vector.getAbs() * sin / max + turn;
        double rb = vector.getAbs() * cos / max - turn;

        if ((vector.getAbs() + Math.abs(turn)) > 1) {
            lf /= vector.getAbs() + Math.abs(turn);
            rf /= vector.getAbs() + Math.abs(turn);
            lb /= vector.getAbs() + Math.abs(turn);
            lb /= vector.getAbs() + Math.abs(turn);
        }

        return new WheelsRatio<>(lf, rf, lb, rb);
    }
}
