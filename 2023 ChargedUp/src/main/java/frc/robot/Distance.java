package frc.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.RobotController;

public class Distance {
    public static double distCalc(double rawValue) {
        double voltage_scale_factor = 5/RobotController.getVoltage5V();
        double currentDistanceInches = rawValue * voltage_scale_factor * 0.0492;
        return currentDistanceInches;
    }
}
