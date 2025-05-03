package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp(name = "TeleOp", group = "zzz")
public class Test extends LinearOpMode {
    public void runOpMode() {
        DcMotorEx mt = hardwareMap.get(DcMotorEx.class, "motor0");
        waitForStart();
        while(opModeIsActive()){
            mt.setVelocity(5000);

            telemetry.addData("ticks", mt.getCurrentPosition());
            telemetry.update();
        }
    }

}
