// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveSubSystem extends SubsystemBase {

  Spark driveMotor1 = new Spark(0);
	Spark driveMotor2 = new Spark(1);
	Spark driveMotor3 = new Spark(2);
	Spark driveMotor4 = new Spark(3);

  MotorControllerGroup leftDriveMotors = new MotorControllerGroup(driveMotor1, driveMotor2);
	MotorControllerGroup rightDriveMotors = new MotorControllerGroup(driveMotor3, driveMotor4);

  DifferentialDrive driveTrain = new DifferentialDrive(leftDriveMotors, rightDriveMotors);

  /** Creates a new Drive. */
  public DriveSubSystem() {
  
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void driveTrainCommand() {

  }

  public void setRaw(double leftJoystickValue, double rightJoystickValue) {
    driveTrain.tankDrive(leftJoystickValue, rightJoystickValue);
  }

}
