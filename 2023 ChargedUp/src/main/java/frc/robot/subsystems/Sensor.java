// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import org.photonvision.PhotonCamera;
import org.photonvision.targeting.PhotonPipelineResult;
import org.photonvision.targeting.PhotonTrackedTarget;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalOutput;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
/**
 * @description The sensor subsystem. For sensors.
 * @example The PhotonVision subsystem
 * 
 */
public class Sensor extends SubsystemBase {
  /** Creates a new Vision. */
  private final DigitalOutput ultrasonicPin_1;
  private final AnalogInput ultrasonic;

  short currentDistanceInches;
  PhotonPipelineResult result; PhotonTrackedTarget target;
  Double yaw; Double pitch; int aprilTagID;
  final PhotonCamera camera = new PhotonCamera("Logitech,_Inc._Webcam_C310");

  public Sensor() {
    
    
  
    ultrasonic = new AnalogInput(0);
    
  
    ultrasonicPin_1 = new DigitalOutput(0);
  
    

    camera.setPipelineIndex(2);
    ultrasonicPin_1.set(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    currentDistanceInches = (short) Math.round(Distance.distCalc(ultrasonic.getValue()));
      System.out.println("Object distance in inches: " + currentDistanceInches);
      result = camera.getLatestResult();
  }

  public Double getYaw() {
    yaw = target.getYaw();
  }
}
