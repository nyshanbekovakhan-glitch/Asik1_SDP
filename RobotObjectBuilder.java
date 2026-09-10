package robot;

public class RobotObjectBuilder implements RobotBuilder {
    private String name;
    private String robotType;
    private String processor;
    private int battery;
    private String sensors;
    private boolean hasAI;
    @Override
    public RobotBuilder setName(String name) {
        this.name = name;
        return this;
    }
    @Override
    public RobotBuilder setRobotType(String robotType) {
        this.robotType = robotType;
        return this;
    }
    @Override
    public RobotBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }
    @Override
    public RobotBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }
    @Override
    public RobotBuilder setSensors(String sensors) {
        this.sensors = sensors;
        return this;
    }
    @Override
    public RobotBuilder setAI(boolean hasAI) {
        this.hasAI = hasAI;
        return this;
    }
    public CustomRobot build() {
        validate();
        return new CustomRobot(
                name,
                robotType,
                processor,
                battery,
                sensors,
                hasAI
        );
    }
    private void validate() {
        if (name == null || name.isBlank()) {
            throw new IllegalStateException("Robot name is required");
        }
        if (robotType == null || robotType.isBlank()) {
            throw new IllegalStateException("Robot type is required");
        }
        if (processor == null || processor.isBlank()) {
            throw new IllegalStateException("Processor is required");
        }
        if (battery <= 0) {
            throw new IllegalStateException("Battery must be greater than 0");
        }
        if (sensors == null || sensors.isBlank()) {
            throw new IllegalStateException("Sensors are required");
        }
    }
}
