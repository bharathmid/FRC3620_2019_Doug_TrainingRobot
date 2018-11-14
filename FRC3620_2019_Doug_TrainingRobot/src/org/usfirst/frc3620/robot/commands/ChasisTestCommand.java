package org.usfirst.frc3620.robot.commands;

import org.usfirst.frc3620.robot.Robot;
import org.usfirst.frc3620.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ChasisTestCommand extends Command {
	
	SpeedController leftSpeedController1 = RobotMap.driveSubsystemLeftSpeedController1;
    SpeedController leftSpeedController2 = RobotMap.driveSubsystemLeftSpeedController2;
    SpeedController rightSpeedController1 = RobotMap.driveSubsystemRightSpeedController1;
    SpeedController rightSpeedController2 = RobotMap.driveSubsystemRightSpeedController2;

    public ChasisTestCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveSubsystem);
    } 

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double leftJoystick = Robot.oi.getLeftVerticalJoystick();
    	double rightJoystick = Robot.oi.getRightVerticalJoystick();
    	
    	double x = Robot.oi.getRightHorizontalJoystick();
    	double y = Robot.oi.getRightVerticalJoystick();
    	
    	double L = -y+x;
    	double R = -y-x;
    	
    	double max = Math.abs(L);
    	if(max < Math.abs
    			(R)) {
    		max = Math.abs(R);
    	}
    	
    	if (max > 1) {
    		L /= max;
    		R /= max;
    	}
    	
    	leftSpeedController1.set(L);
    	leftSpeedController2.set(L);
    	rightSpeedController1.set(-R);
    	rightSpeedController2.set(-R);
    	
//    	leftSpeedController1.set(-rightJoystick);
//    	leftSpeedController2.set(-rightJoystick);
//    	rightSpeedController1.set(leftJoystick);
//    	rightSpeedController2.set(leftJoystick);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	leftSpeedController1.set(0);
    	leftSpeedController2.set(0);
    	rightSpeedController1.set(0);
    	rightSpeedController2.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
