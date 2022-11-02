package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class shooter extends SubsystemBase {
    private WPI_TalonFX leftshooter = new WPI_TalonFX(Constants.shooter.left_shooter_motor);
    private WPI_TalonFX rightshooter = new WPI_TalonFX(Constants.shooter.right_shooter_motor);

    private MotorControllerGroup shooter = new MotorControllerGroup(leftshooter, rightshooter);
    
    public shooter() {
        leftshooter.setInverted(true);
    }
    public void setShooter(double speed) {
        shooter.set(speed);
    }

}
