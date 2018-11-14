package org.usfirst.frc3620.robot.commands;

import org.slf4j.Logger;
import org.usfirst.frc3620.logger.EventLogging;
import org.usfirst.frc3620.logger.EventLogging.Level;
import org.usfirst.frc3620.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class SillyCommand extends TimedCommand {
	Logger logger = EventLogging.getLogger(getClass(), Level.INFO);
	
	String label;

    public SillyCommand(String _label, double timeout) {
        super(timeout);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        label = _label;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	EventLogging.commandMessage(logger, label);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Called once after timeout
    protected void end() {
    	EventLogging.commandMessage(logger, label);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	EventLogging.commandMessage(logger, label);
    }
}
