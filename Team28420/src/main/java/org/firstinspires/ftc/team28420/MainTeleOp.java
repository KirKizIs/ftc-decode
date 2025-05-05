package org.firstinspires.ftc.team28420;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.team28420.util.Config;

@TeleOp(name = "Main", group = "prod")
public class MainTeleOp extends LinearOpMode {

    @Override
    public void runOpMode() {
        initialize();
        setup();

        waitForStart();
        while (opModeIsActive()) {

        }
    }

    private void initialize() {
        Config.Etc.telemetry = telemetry;
    }

    private void setup() {

    }
}
