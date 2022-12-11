package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

@Autonomous(name="Reapr Main Auto") //Name appearing on Driver Station

public class Reapr_AutoPOC extends LinearOpMode {

    // Meccanum Drivetrain
    DcMotor motorFrontLeft = hardwareMap.dcMotor.get("motorFrontLeft");
    DcMotor motorBackLeft = hardwareMap.dcMotor.get("motorBackLeft");
    DcMotor motorFrontRight = hardwareMap.dcMotor.get("motorFrontRight");
    DcMotor motorBackRight = hardwareMap.dcMotor.get("motorBackRight");

    //Servo claw = hardwareMap.servo.get("reaprClaw");// name of server on control hub is reaprClaw

    //https://learnroadrunner.com/drive-constants.html#samplemecanumdrive-motor-direction - Mecanum motion based on motor directions

    // setting power (driving forward)
    public void DriveForwardByTime(double power, long time, double distance) {
        final double REAPR_WHEEL_DIAMETER = 10.0; // ~ 10 centimeters
        final double REAPR_WHEEL_CIRCUMFERENCE = Math.PI * REAPR_WHEEL_DIAMETER;
        final double TICK = 384.539792; //from goBILDA 5202 specifications
        double rotationsNeeded = distance / REAPR_WHEEL_CIRCUMFERENCE;
        int encoderDrivingTarget = (int)(rotationsNeeded * TICK);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorFrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motorFrontLeft.setTargetPosition(encoderDrivingTarget);
        motorBackLeft.setTargetPosition(encoderDrivingTarget);
        motorFrontRight.setTargetPosition(encoderDrivingTarget);
        motorBackRight.setTargetPosition(encoderDrivingTarget);

        motorFrontLeft.setPower(power);
        motorFrontRight.setPower(power);
        motorBackLeft.setPower(power);
        motorBackRight.setPower(power);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motorFrontLeft.setPower(0);
        motorFrontRight.setPower(0);
        motorBackLeft.setPower(0);
        motorBackRight.setPower(0);
    }
    // setting power (driving backward)
    public void DriveBackwardByTime(double power, long time, double distance) {
        final double REAPR_WHEEL_DIAMETER = 10.0; // ~ 10 centimeters
        final double REAPR_WHEEL_CIRCUMFERENCE = Math.PI * REAPR_WHEEL_DIAMETER;
        final double TICK = 384.539792; //from goBILDA 5202 specifications
        double rotationsNeeded = distance / REAPR_WHEEL_CIRCUMFERENCE;
        int encoderDrivingTarget = (int)(rotationsNeeded * TICK);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorFrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motorFrontLeft.setTargetPosition(encoderDrivingTarget);
        motorBackLeft.setTargetPosition(encoderDrivingTarget);
        motorFrontRight.setTargetPosition(encoderDrivingTarget);
        motorBackRight.setTargetPosition(encoderDrivingTarget);

        motorFrontLeft.setPower(-power);
        motorFrontRight.setPower(-power);
        motorBackLeft.setPower(-power);
        motorBackRight.setPower(-power);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motorFrontLeft.setPower(0);
        motorFrontRight.setPower(0);
        motorBackLeft.setPower(0);
        motorBackRight.setPower(0);
    }
    // setting power (turning right)
    public void TurnRightByTime(double power, long time, double distance)
    {
        final double REAPR_WHEEL_DIAMETER = 10.0; // ~ 10 centimeters
        final double REAPR_WHEEL_CIRCUMFERENCE = Math.PI * REAPR_WHEEL_DIAMETER;
        final double TICK = 384.539792; //from goBILDA 5202 specifications
        double rotationsNeeded = distance / REAPR_WHEEL_CIRCUMFERENCE;
        int encoderDrivingTarget = (int)(rotationsNeeded * TICK);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorFrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motorFrontLeft.setTargetPosition(encoderDrivingTarget);
        motorBackLeft.setTargetPosition(encoderDrivingTarget);
        motorFrontRight.setTargetPosition(encoderDrivingTarget);
        motorBackRight.setTargetPosition(encoderDrivingTarget);

        motorFrontLeft.setPower(power);
        motorBackLeft.setPower(power);
        motorFrontRight.setPower(-power); //front right and back left
        motorBackRight.setPower(-power);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motorFrontLeft.setPower(0);
        motorBackLeft.setPower(0);
        motorFrontRight.setPower(0);
        motorBackRight.setPower(0);
    }
    // setting power (turning left)
    public void TurnLeftByTime(double power, long time, double distance)
    {
        final double REAPR_WHEEL_DIAMETER = 10.0; // ~ 10 centimeters
        final double REAPR_WHEEL_CIRCUMFERENCE = Math.PI * REAPR_WHEEL_DIAMETER;
        final double TICK = 384.539792; //from goBILDA 5202 specifications
        double rotationsNeeded = distance / REAPR_WHEEL_CIRCUMFERENCE;
        int encoderDrivingTarget = (int)(rotationsNeeded * TICK);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorFrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motorFrontLeft.setTargetPosition(encoderDrivingTarget);
        motorBackLeft.setTargetPosition(encoderDrivingTarget);
        motorFrontRight.setTargetPosition(encoderDrivingTarget);
        motorBackRight.setTargetPosition(encoderDrivingTarget);

        motorFrontLeft.setPower(-power); //Give positive power to both right motors and negative to both left motors to strafe left
        motorBackLeft.setPower(-power);
        motorFrontRight.setPower(power);
        motorBackRight.setPower(power);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motorFrontLeft.setPower(0);
        motorBackLeft.setPower(0);
        motorFrontRight.setPower(0);
        motorBackRight.setPower(0);
    }
    // setting power (strafe left)
    public void GoLeftByTime(double power, long time, double distance) {
        final double REAPR_WHEEL_DIAMETER = 10.0; // ~ 10 centimeters
        final double REAPR_WHEEL_CIRCUMFERENCE = Math.PI * REAPR_WHEEL_DIAMETER;
        final double TICK = 384.539792; //from goBILDA 5202 specifications
        double rotationsNeeded = distance / REAPR_WHEEL_CIRCUMFERENCE;
        int encoderDrivingTarget = (int)(rotationsNeeded * TICK);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorFrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motorFrontLeft.setTargetPosition(encoderDrivingTarget);
        motorBackLeft.setTargetPosition(encoderDrivingTarget);
        motorFrontRight.setTargetPosition(encoderDrivingTarget);
        motorBackRight.setTargetPosition(encoderDrivingTarget);

        motorFrontLeft.setPower(-power);
        motorFrontRight.setPower(power);
        motorBackLeft.setPower(power);
        motorBackRight.setPower(-power);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motorFrontLeft.setPower(0);
        motorFrontRight.setPower(0);
        motorBackLeft.setPower(0);
        motorBackRight.setPower(0);
    }
    // setting power (strafe right)
    public void GoRightByTime(double power, long time, double distance) {
        final double REAPR_WHEEL_DIAMETER = 10.0; // ~ 10 centimeters
        final double REAPR_WHEEL_CIRCUMFERENCE = Math.PI * REAPR_WHEEL_DIAMETER;
        final double TICK = 384.539792; //from goBILDA 5202 specifications
        double rotationsNeeded = distance / REAPR_WHEEL_CIRCUMFERENCE;
        int encoderDrivingTarget = (int)(rotationsNeeded * TICK);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorFrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motorFrontLeft.setTargetPosition(encoderDrivingTarget);
        motorBackLeft.setTargetPosition(encoderDrivingTarget);
        motorFrontRight.setTargetPosition(encoderDrivingTarget);
        motorBackRight.setTargetPosition(encoderDrivingTarget);

        motorFrontLeft.setPower(power);
        motorFrontRight.setPower(-power);
        motorBackLeft.setPower(-power);
        motorBackRight.setPower(power);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motorFrontLeft.setPower(0);
        motorFrontRight.setPower(0);
        motorBackLeft.setPower(0);
        motorBackRight.setPower(0);
    }
    // setting power (go forward & left)
    public void ForwardLeftByTime(double power, long time, double distance) {
        final double REAPR_WHEEL_DIAMETER = 10.0; // ~ 10 centimeters
        final double REAPR_WHEEL_CIRCUMFERENCE = Math.PI * REAPR_WHEEL_DIAMETER;
        final double TICK = 384.539792; //from goBILDA 5202 specifications
        double rotationsNeeded = distance / REAPR_WHEEL_CIRCUMFERENCE;
        int encoderDrivingTarget = (int)(rotationsNeeded * TICK);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorFrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motorFrontLeft.setTargetPosition(encoderDrivingTarget);
        motorBackLeft.setTargetPosition(encoderDrivingTarget);
        motorFrontRight.setTargetPosition(encoderDrivingTarget);
        motorBackRight.setTargetPosition(encoderDrivingTarget);

        motorFrontLeft.setPower(0);
        motorFrontRight.setPower(power);
        motorBackLeft.setPower(power);
        motorBackRight.setPower(0);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motorFrontLeft.setPower(0);
        motorFrontRight.setPower(0);
        motorBackLeft.setPower(0);
        motorBackRight.setPower(0);
    }
    // setting power (go forward & right)
    public void ForwardRightByTime(double power, long time, double distance) {
        final double REAPR_WHEEL_DIAMETER = 10.0; // ~ 10 centimeters
        final double REAPR_WHEEL_CIRCUMFERENCE = Math.PI * REAPR_WHEEL_DIAMETER;
        final double TICK = 384.539792; //from goBILDA 5202 specifications
        double rotationsNeeded = distance / REAPR_WHEEL_CIRCUMFERENCE;
        int encoderDrivingTarget = (int)(rotationsNeeded * TICK);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorFrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motorFrontLeft.setTargetPosition(encoderDrivingTarget);
        motorBackLeft.setTargetPosition(encoderDrivingTarget);
        motorFrontRight.setTargetPosition(encoderDrivingTarget);
        motorBackRight.setTargetPosition(encoderDrivingTarget);

        motorFrontLeft.setPower(power);
        motorFrontRight.setPower(0);
        motorBackLeft.setPower(0);
        motorBackRight.setPower(power);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motorFrontLeft.setPower(0);
        motorFrontRight.setPower(0);
        motorBackLeft.setPower(0);
        motorBackRight.setPower(0);
    }
    // setting power (go backward & left)
    public void BackwardLeftByTime(double power, long time, double distance) {
        final double REAPR_WHEEL_DIAMETER = 10.0; // ~ 10 centimeters
        final double REAPR_WHEEL_CIRCUMFERENCE = Math.PI * REAPR_WHEEL_DIAMETER;
        final double TICK = 384.539792; //from goBILDA 5202 specifications
        double rotationsNeeded = distance / REAPR_WHEEL_CIRCUMFERENCE;
        int encoderDrivingTarget = (int)(rotationsNeeded * TICK);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorFrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motorFrontLeft.setTargetPosition(encoderDrivingTarget);
        motorBackLeft.setTargetPosition(encoderDrivingTarget);
        motorFrontRight.setTargetPosition(encoderDrivingTarget);
        motorBackRight.setTargetPosition(encoderDrivingTarget);

        motorFrontLeft.setPower(-power);
        motorFrontRight.setPower(0);
        motorBackLeft.setPower(0);
        motorBackRight.setPower(-power);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motorFrontLeft.setPower(0);
        motorFrontRight.setPower(0);
        motorBackLeft.setPower(0);
        motorBackRight.setPower(0);
    }
    // setting power (go backward & left)
    public void BackwardRightByTime(double power, long time, double distance) {
        final double REAPR_WHEEL_DIAMETER = 10.0; // ~ 10 centimeters
        final double REAPR_WHEEL_CIRCUMFERENCE = Math.PI * REAPR_WHEEL_DIAMETER;
        final double TICK = 384.539792; //from goBILDA 5202 specifications
        double rotationsNeeded = distance / REAPR_WHEEL_CIRCUMFERENCE;
        int encoderDrivingTarget = (int)(rotationsNeeded * TICK);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorFrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motorFrontLeft.setTargetPosition(encoderDrivingTarget);
        motorBackLeft.setTargetPosition(encoderDrivingTarget);
        motorFrontRight.setTargetPosition(encoderDrivingTarget);
        motorBackRight.setTargetPosition(encoderDrivingTarget);

        motorFrontLeft.setPower(0);
        motorFrontRight.setPower(-power);
        motorBackLeft.setPower(-power);
        motorBackRight.setPower(0);

        motorFrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motorFrontLeft.setPower(0);
        motorFrontRight.setPower(0);
        motorBackLeft.setPower(0);
        motorBackRight.setPower(0);
    }
    /*
    public void Claw(double clawPOS){

        double clawPosition = clawPOS;
        final double clawSpeed = 0.01;// change to 100th when button is hold
        final double clawMinRange = 0.0;
        final double clawMaxRange = 0.6;
        clawPosition = Range.clip(clawPosition, clawMinRange, clawMaxRange);
        claw.setPosition(clawPosition);

        telemetry.addData("claw", "%.2f", clawPosition); //displays the values on the driver hub
        telemetry.update();
    }
    */


    public void goForwardForADistance(double distance, double power)
    {
        final double REAPR_WHEEL_DIAMETER = 10.0; // ~ 10 centimeters
        final double REAPR_WHEEL_CIRCUMFERENCE = Math.PI * REAPR_WHEEL_DIAMETER;
        final double TICK = 384.539792; //from goBILDA 5202 specifications
        double rotationsNeeded = distance / REAPR_WHEEL_CIRCUMFERENCE;
        int encoderDrivingTarget = (int)(rotationsNeeded * TICK);


        motorBackRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorFrontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        //reset all motors
        motorFrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorFrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motorBackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        encoderDrivingTarget = 5000;
        //set target position
        motorFrontLeft.setTargetPosition(encoderDrivingTarget);
        motorBackLeft.setTargetPosition(encoderDrivingTarget);
        motorFrontRight.setTargetPosition(encoderDrivingTarget);
        motorBackRight.setTargetPosition(encoderDrivingTarget);

        //set power to the motors
        motorFrontLeft.setPower(power);
        motorBackLeft.setPower(power);
        motorFrontRight.setPower(power);
        motorBackRight.setPower(power);

        //go to target position
        motorFrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorFrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorBackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        //set power to zero
        motorFrontLeft.setPower(0);
        motorBackLeft.setPower(0);
        motorFrontRight.setPower(0);
        motorBackRight.setPower(0);

    }


    @Override //allows to over write previous method from LinearOpMode
    public void runOpMode() throws InterruptedException{
        waitForStart(); //pause here for driver to push start button
        //INSERT CODE FROM HERE, You can all all the functions below here

        /*
        DriveForwardByTime(0.5, 2000); //drive forward by time function
        TurnRightByTime(0.2, 1500); //turn right by time function
        DriveForwardByTime(0.5, 2000); //drive forward by time function
        TurnLeftByTime(0.2, 1500); //turn left by time function
        */

        goForwardForADistance(50, 0.5);//encoder logic

        /*
        TurnRightByTime(0.2, 2000);
        goForwardForADistance(50,0.5);
        TurnLeftByTime(0.2, 2000);
        */

    }


}



