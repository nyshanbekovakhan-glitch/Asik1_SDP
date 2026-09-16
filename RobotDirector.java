package robot;

public class RobotDirector {
    public void makeHomeRobot(RobotBuilder builder) {
        builder
                .setName("HomeBot")
                .setRobotType("Home Assistant")
                .setProcessor("ARM")
                .setBattery(12)
                .setSensors("Camera, Distance Sensor")
                .setAI(true);
    }
    public void makeRescueRobot(RobotBuilder builder) {
        builder
                .setName("RescueBot")
                .setRobotType("Emergency Rescue")
                .setProcessor("Intel")
                .setBattery(24)
                .setSensors("Camera, Thermal Sensor, Distance Sensor")
                .setAI(true);
    }
}
