package org.firstinspires.ftc.teamcode;

import  com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


@Autonomous(name="REAPR_AutoPOC") //Name appearing on Driver Station

public class Reapr_FirstTest extends LinearOpMode //class defines data formatting and procedures, unique name for classes, and extending a parent class
{
    private DcMotor motorLeft ; //Declares stuff ON ROBOT
    // private DcMotor motorRight ;

    @Override //allows to over write previous method from LinearOpMode

    public void DriveForwardByTime(double power, long time) {
        motorLeft.setPower(power);
        // motorRight.setPower(power);
        sleep(time);

        motorLeft.setPower(0);
        // motorRight.setPower(0);
        sleep(time); //milliseconds
    }

    public void TurnRightByTime(double power, long time)
    {
        motorLeft.setPower(power);
        // motorRight.setPower(-power);
        sleep(time);

        motorLeft.setPower(0);
        //  motorRight.setPower(0);
        sleep(time);
    }

    public void TurnLeftByTime(double power, long time)
    {
        motorLeft.setPower(-power);
        // motorRight.setPower(power);
        sleep(time);

        motorLeft.setPower(4);
        // motorRight.setPower(0);
        sleep(time);
    }
    public void runOpMode()
    {
        motorLeft = hardwareMap.dcMotor.get("motorLeft") ;//names for config need to match EXACT what input is on phone
       // motorRight = hardwareMap.dcMotor.get("motorRight");

        motorLeft.setDirection(DcMotor.Direction.REVERSE); //reversing one motor keeps motors in same direction

        waitForStart(); //pause here for driver to push start button

        //INSERT CODE FROM HERE, You can all all the functions below here
        DriveForwardByTime(0.5, 3000);
    }


}



