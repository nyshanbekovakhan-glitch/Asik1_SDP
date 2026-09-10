package robot;

public class Main {
    public static void main(String[] args) {
        RobotDirector director = new RobotDirector();
        RobotObjectBuilder objectBuilder = new RobotObjectBuilder();
        director.makeHomeRobot(objectBuilder);
        CustomRobot homeRobot = objectBuilder.build();
        System.out.println("=== ROBOT OBJECT ===");
        System.out.println(homeRobot);
        RobotSpecBuilder specBuilder = new RobotSpecBuilder();
        director.makeHomeRobot(specBuilder);
        String specification = specBuilder.build();
        System.out.println("\n=== ROBOT SPECIFICATION ===");
        System.out.println(specification);
        RobotObjectBuilder rescueBuilder = new RobotObjectBuilder();
        director.makeRescueRobot(rescueBuilder);
        CustomRobot rescueRobot = rescueBuilder.build();
        System.out.println("=== RESCUE ROBOT ===");
        System.out.println(rescueRobot);
    }
}
