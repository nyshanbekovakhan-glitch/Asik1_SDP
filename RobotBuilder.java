package robot;

public interface RobotBuilder {

    RobotBuilder setName(String name);

    RobotBuilder setRobotType(String robotType);

    RobotBuilder setProcessor(String processor);

    RobotBuilder setBattery(int battery);

    RobotBuilder setSensors(String sensors);

    RobotBuilder setAI(boolean hasAI);
}
