package robot;

public class RobotSpecBuilder implements RobotBuilder {
    private StringBuilder specification;
    public RobotSpecBuilder() {
        specification = new StringBuilder();
    }
    @Override
    public RobotBuilder setName(String name) {
        specification.append("Name: ").append(name).append("\n");
        return this;
    }
    @Override
    public RobotBuilder setRobotType(String robotType) {
        specification.append("Type: ").append(robotType).append("\n");
        return this;
    }
    @Override
    public RobotBuilder setProcessor(String processor) {
        specification.append("Processor: ").append(processor).append("\n");
        return this;
    }
    @Override
    public RobotBuilder setBattery(int battery) {
        specification.append("Battery: ").append(battery).append(" hours\n");
        return this;
    }
    @Override
    public RobotBuilder setSensors(String sensors) {
        specification.append("Sensors: ").append(sensors).append("\n");
        return this;
    }
    @Override
    public RobotBuilder setAI(boolean hasAI) {
        specification.append("AI: ").append(hasAI ? "Yes" : "No").append("\n");
        return this;
    }
    public String build() {
        if (specification.isEmpty()) {
            throw new IllegalStateException("Robot specification is empty");
        }
        return specification.toString();
    }
}
