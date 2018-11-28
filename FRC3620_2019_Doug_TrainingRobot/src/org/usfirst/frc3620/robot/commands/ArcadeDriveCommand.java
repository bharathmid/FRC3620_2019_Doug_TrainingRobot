package org.usfirst.frc3620.robot.commands;

import java.sql.Driver;

import org.usfirst.frc3620.robot.Robot;
import org.usfirst.frc3620.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class ArcadeDriveCommand extends Command {
	
	DifferentialDrive differentialDrive = RobotMap.driveSubsystemDifferentialDrive;

    public ArcadeDriveCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double vertical = Robot.oi.getLeftVerticalJoystickSquared();
    	double horizontal = Robot.oi.getLeftHorizontalJoystickSquared();
    	differentialDrive.arcadeDrive(vertical, horizontal);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
