/* Source code from:
https://gm0.org/en/latest/docs/software/tutorials/mecanum-drive.html


This is the main teleop file, with servos (for claws) and dc motors (for the elevator system)
*/

package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name = "Reapr Main TeleOP")

public class Reapr_Main_TeleOP extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        // Declare our motors
        // Make sure your ID's match your configuration

        // Meccanum Drivetrain
        DcMotor motorFrontLeft = hardwareMap.dcMotor.get("motorFrontLeft");
        DcMotor motorBackLeft = hardwareMap.dcMotor.get("motorBackLeft");
        DcMotor motorFrontRight = hardwareMap.dcMotor.get("motorFrontRight");
        DcMotor motorBackRight = hardwareMap.dcMotor.get("motorBackRight");

        // Reverse the right side motors
        // Reverse left motors if you are using NeveRests
        motorFrontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        motorBackLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        motorBackRight.setDirection(DcMotorSimple.Direction.REVERSE);  // This was connected on the expansion hub, it needs to be reversed



        // Elevator Motors
        DcMotor elevatorMotorLeft = hardwareMap.dcMotor.get("elevatorMotorLeft");
        DcMotor elevatorMotorRight = hardwareMap.dcMotor.get("elevatorMotorRight");


        // Claw Motors (Servo)
        Servo claw = hardwareMap.servo.get("reaprClaw");// name of server on control hub is reaprClaw
        double clawPosition = 0.0;
        final double clawSpeed = 0.005;// change to 100th when button is hold
        final double clawMinRange = 0.0;
        final double clawMaxRange = 0.6;


        waitForStart();

        if (isStopRequested()) return;

        while (opModeIsActive()) {
            // Mecccanum controls
            double y = -gamepad1.left_stick_y; // Remember, this is reversed!
            double x = gamepad1.left_stick_x * 1.1; // Counteract imperfect strafing
            double rx = gamepad1.right_stick_x;

            // Denominator is the largest motor power (absolute value) or 1
            // This ensures all the powers maintain the same ratio, but only when
            // at least one is out of the range [-1, 1]
            double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
            double frontLeftPower = (y + x + rx) / denominator; //Positive rotation results in forward & right motion
            double backLeftPower = (y - x + rx) / denominator; //Positive rotation results in forward & left motion
            double frontRightPower = (y - x - rx) / denominator; //Positive rotation results in forward & left motion
            double backRightPower = (y + x - rx) / denominator; //Positive rotation results in forward & right motion

            motorFrontLeft.setPower(frontLeftPower);
            motorBackLeft.setPower(backLeftPower);
            motorFrontRight.setPower(frontRightPower);
            motorBackRight.setPower(backRightPower);

            
            // Servo Controls

            if (gamepad1.x) // if "a" button is pressed on gamepad
                clawPosition += clawSpeed;
            else if (gamepad1.b) // if "y" button is pressed on gamepad
                clawPosition -= clawSpeed;

            clawPosition = Range.clip(clawPosition, clawMinRange, clawMaxRange);
            claw.setPosition(clawPosition);

            telemetry.addData("claw", "%.2f", clawPosition); //displays the values on the driver hub
            telemetry.update();


            // Elevator Controls


            while (gamepad1.a){ // Move down
                elevatorMotorLeft.setPower(0.2);
                elevatorMotorRight.setPower(-0.2);
            }
            elevatorMotorLeft.setPower(0);
            elevatorMotorRight.setPower(0);

            while (gamepad1.y){ // Move up
                elevatorMotorLeft.setPower(-0.5);
                elevatorMotorRight.setPower(0.5);
            }
            elevatorMotorLeft.setPower(0);
            elevatorMotorRight.setPower(0);
            
            




        }
    }


}