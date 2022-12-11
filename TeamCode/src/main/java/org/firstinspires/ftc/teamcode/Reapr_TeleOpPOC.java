package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Reapr TeleOpPOC") //program code that shows on driver station

public class Reapr_TeleOpPOC extends LinearOpMode {

    private DcMotor motorLeft;
    private DcMotor motorRight;

    @Override
    public void runOpMode()
    {
        //All code will go here
        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        motorRight = hardwareMap.dcMotor.get("motorRight");

        motorLeft.setDirection(DcMotor.Direction.REVERSE); //important otherwise robot will start spinning

        waitForStart();

        // using joystick
        while(opModeIsActive())
        {

            motorLeft.setPower(-gamepad1.left_stick_y);
            motorRight.setPower(-gamepad1.right_stick_y);

            idle();

        }
    }
}
