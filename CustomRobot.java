package robot;

public class CustomRobot {
    private final String name;
    private final String robotType;
    private final String processor;
    private final int battery;
    private final String sensors;
    private final boolean hasAI;
    CustomRobot(
            String name,
            String robotType,
            String processor,
            int battery,
            String sensors,
            boolean hasAI) {
        this.name = name;
        this.robotType = robotType;
        this.processor = processor;
        this.battery = battery;
        this.sensors = sensors;
        this.hasAI = hasAI;
    }
    public String getName() {
        return name;
    }
    public String getRobotType() {
        return robotType;
    }
    public String getProcessor() {
        return processor;
    }
    public int getBattery() {
        return battery;
    }
    public String getSensors() {
        return sensors;
    }
    public boolean hasAI() {
        return hasAI;
    }
    @Override
    public String toString() {
        return "Robot: " + name +
                "\nType: " + robotType +
                "\nProcessor: " + processor +
                "\nBattery: " + battery + " hours" +
                "\nSensors: " + sensors +
                "\nAI: " + (hasAI ? "Yes" : "No");
    }
}