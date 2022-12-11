package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name="Reapr Auto POC with Encoder") //Name appearing on Driver Station

public class Reapr_AutoPOC_WithEncoder extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException
    {
        waitForStart();

        // Mecanum Drivetrain
        DcMotor motorFrontLeft = hardwareMap.dcMotor.get("motorFrontLeft");
        DcMotor motorBackLeft = hardwareMap.dcMotor.get("motorBackLeft");
        DcMotor motorFrontRight = hardwareMap.dcMotor.get("motorFrontRight");
        DcMotor motorBackRight = hardwareMap.dcMotor.get("motorBackRight");



        // reset encoder counts kept by motors.
        motorFrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        // Reverse the right side motors
        // Reverse left motors if you are using NeveRests
        motorFrontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        motorBackLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        motorBackRight.setDirection(DcMotorSimple.Direction.REVERSE); // On expansion hub, also needs to be reversed

        // set motors to run forward for 5000 encoder counts.
        motorFrontLeft.setTargetPosition(1200000);
        motorBackLeft.setTargetPosition(1200000);
        motorFrontRight.setTargetPosition(1200000);
        motorBackRight.setTargetPosition(1200000);

        motorFrontLeft.setPower(1);
        motorBackLeft.setPower(1);
        motorFrontRight.setPower(1);
        motorBackRight.setPower(1);

        sleep(5000);

        // set motors to run to target encoder position and stop with brakes on.
        motorFrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);



/*
        telemetry.addData("Mode", "waiting");
        telemetry.update();

        // wait for start button.


        telemetry.addData("Mode", "running");
        telemetry.update();

        // set all motors to 25% power. Movement will start. Sign of power is
        // ignored as sign of target encoder position controls direction when
        // running to position.

        motorFrontLeft.setPower(0.25);
        motorBackLeft.setPower(0.25);
        motorFrontRight.setPower(0.25);
        motorBackRight.setPower(0.25);

        sleep(5000);

        // set motor power to zero to turn off motors. The motors stop on their own but
        // power is still applied so we turn off the power.

        motorFrontLeft.setPower(0.0);
        motorBackLeft.setPower(0.0);
        motorFrontRight.setPower(0.0);
        motorBackRight.setPower(0.0);

        /*
        // wait 5 sec to you can observe the final encoder position.

       // resetStartTime();

        // From current position back up to starting point. In this example instead of
        // having the motor monitor the encoder we will monitor the encoder ourselves.


        /*
        motorFrontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        motorFrontLeft.setTargetPosition(0);
        motorBackLeft.setTargetPosition(0);
        motorFrontRight.setTargetPosition(0);
        motorBackRight.setTargetPosition(0);

        // Power sign matters again as we are running without encoder.
        motorFrontLeft.setPower(-0.25);
        motorBackLeft.setPower(-0.25);
        motorFrontRight.setPower(-0.25);
        motorBackRight.setPower(-0.25);
        // wait while opmode is active and left motor is busy running to position.


        // set motor power to zero to turn off motors. The motors stop on their own but
        // power is still applied so we turn off the power.

        motorFrontLeft.setPower(0.0);
        motorBackLeft.setPower(0.0);
        motorFrontRight.setPower(0.0);
        motorBackLeft.setPower(0.0);

        // wait 5 sec to you can observe the final encoder position.

       // resetStartTime();

        // From current position back up to starting point. In this example instead of
        // having the motor monitor the encoder we will monitor the encoder ourselves.

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        motorFrontLeft.setTargetPosition(0);
        motorBackLeft.setTargetPosition(0);
        motorFrontRight.setTargetPosition(0);
        motorBackRight.setTargetPosition(0);

        // Power sign matters again as we are running without encoder.
        motorFrontLeft.setPower(-0.25);
        motorBackLeft.setPower(-0.25);
        motorFrontRight.setPower(-0.25);
        motorBackRight.setPower(-0.25);


        motorFrontLeft.setPower(0.0);
        motorBackLeft.setPower(0.0);
        motorFrontRight.setPower(0.0);
        motorBackRight.setPower(0.0);

       // resetStartTime();
       */


    }

}
