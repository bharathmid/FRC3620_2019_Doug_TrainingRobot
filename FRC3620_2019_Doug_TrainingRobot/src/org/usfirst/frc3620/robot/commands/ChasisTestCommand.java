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
    	
    	leftSpeedController1.set(leftJoystick/2);
    	leftSpeedController2.set(leftJoystick/2);
    	rightSpeedController1.set(rightJoystick/2);
    	rightSpeedController2.set(rightJoystick/2);
    	
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
