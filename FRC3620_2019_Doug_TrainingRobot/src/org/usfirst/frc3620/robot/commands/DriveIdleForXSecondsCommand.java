package org.usfirst.frc3620.robot.commands;

import org.slf4j.Logger;
import org.usfirst.frc3620.logger.EventLogging;
import org.usfirst.frc3620.logger.EventLogging.Level;
import org.usfirst.frc3620.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class DriveIdleForXSecondsCommand extends TimedCommand {
	Logger logger = EventLogging.getLogger(getClass(), Level.INFO);

    public DriveIdleForXSecondsCommand(double timeout) {
        super(timeout);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.driveSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	EventLogging.commandMessage(logger);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Called once after timeout
    protected void end() {
    	EventLogging.commandMessage(logger);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	EventLogging.commandMessage(logger);
    }
}
