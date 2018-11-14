package org.usfirst.frc3620.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonomousSillyCommand extends CommandGroup {
	
	class ABC extends CommandGroup {
		public ABC() {
			addSequential(new SillyCommand("A", 2.0));
			addSequential(new SillyCommand("B", 2.0));
			addSequential(new SillyCommand("C", 2.0));
		}
	}

	class DEF extends CommandGroup {
		public DEF() {
			addSequential(new SillyCommand("D", 1.0));
			addSequential(new SillyCommand("E", 1.0));
			addSequential(new SillyCommand("F", 1.0));
		}
	}

	class ABCDEF extends CommandGroup {
		public ABCDEF() {
	    	addParallel(new ABC());
	    	addParallel(new DEF());
		}
	}

    public AutonomousSillyCommand() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	addSequential(new ABCDEF());
    	addSequential(new SillyCommand("G", 1.5));

    	
    	if (false) {
    	addSequential(new SillyCommand("A", 1.5));
    	
    	addSequential(new SillyCommand("B", 1.0));
    	
    	addParallel(new SillyCommand("D", 3.0));
    	addParallel(new SillyCommand("D2", 2.0));
    	addSequential(new SillyCommand("C", 1.0));
    	
    	addSequential(new SillyCommand("E", 3.0));
    	}

    }
    
}
