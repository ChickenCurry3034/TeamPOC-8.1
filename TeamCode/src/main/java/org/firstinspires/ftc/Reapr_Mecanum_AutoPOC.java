// Working as of now

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


@Autonomous(name="Reapr Mecanum AutoPOC") //Name appearing on Driver Station

public class Reaper_Mecanum_AutoPOC extends LinearOpMode //class defines data formatting and procedures, unique name for classes, and extending a parent class
{
    private DcMotor motorFrontLeft = null; //Declares stuff ON ROBOT
    private DcMotor motorBackLeft = null;
    private DcMotor motorFrontRight = null;
    private DcMotor motorBackRight = null;
    
    
    public void MecForward(double power, long time) {
        DcMotor motorFrontLeft = hardwareMap.dcMotor.get("motorFrontLeft");
        DcMotor motorBackLeft = hardwareMap.dcMotor.get("motorBackLeft");
        DcMotor motorFrontRight = hardwareMap.dcMotor.get("motorFrontRight");
        DcMotor motorBackRight = hardwareMap.dcMotor.get("motorBackRight");
        
        motorFrontLeft.setPower(power);
        motorBackLeft.setPower(power);
        motorFrontRight.setPower(power);
        motorBackRight.setPower(power);
        sleep(time);

        motorFrontLeft.setPower(0);
        motorBackLeft.setPower(0);
        motorFrontRight.setPower(0);
        motorBackRight.setPower(0);
        sleep(time); //milliseconds
    }
  
     
    @Override //allows to over write previous method from LinearOpMode
    public void runOpMode()
    
    {
            
        DcMotor motorFrontLeft = hardwareMap.dcMotor.get("motorFrontLeft");
        DcMotor motorBackLeft = hardwareMap.dcMotor.get("motorBackLeft");
        DcMotor motorFrontRight = hardwareMap.dcMotor.get("motorFrontRight");
        DcMotor motorBackRight = hardwareMap.dcMotor.get("motorBackRight");
    

        
    
        // Reverse the right side motors
        // Reverse left motors if you are using NeveRests
        motorFrontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        motorBackLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        motorBackRight.setDirection(DcMotorSimple.Direction.REVERSE);  // This was connected on the expansion hub, it needs to be reversed


        
        

        waitForStart(); //pause here for driver to push start button
        if(opModeIsActive()){
            /*
            motorFrontLeft.setPower(-0.5);
            motorBackLeft.setPower(-0.5);
            motorFrontRight.setPower(-0.5);
            motorBackRight.setPower(-0.5);
            sleep(5000);
    
            motorFrontLeft.setPower(0);
            motorBackLeft.setPower(0);
            motorFrontRight.setPower(0);
            motorBackRight.setPower(0);
            */
            MecForward(0.5, 5000);
        }


    }


}