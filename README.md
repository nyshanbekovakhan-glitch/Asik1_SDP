# Builder Pattern — Custom Robot

## Project Description
This project demonstrates the Builder Design Pattern in Java using a Custom Robot as the product.
The Builder Pattern allows a complex robot to be created step by step. The same construction process can produce two different representations of the robot:
1. A `CustomRobot` Java object.
2. A text-based robot specification.
## Project Structure
* `CustomRobot` — the final product with immutable fields.
* `RobotBuilder` — the Builder interface that defines construction steps.
* `RobotObjectBuilder` — creates a `CustomRobot` object.
* `RobotSpecBuilder` — creates a text specification.
* `RobotDirector` — contains predefined robot configurations.
* `Main` — demonstrates how the builders are used.
## Robot Configurations
### Home Robot
* Name: HomeBot
* Type: Home Assistant
* Processor: ARM
* Battery: 12 hours
* Sensors: Camera, Distance Sensor
* AI: Yes
### Rescue Robot
* Name: RescueBot
* Type: Emergency Rescue
* Processor: Intel
* Battery: 24 hours
* Sensors: Camera, Thermal Sensor, Distance Sensor
* AI: Yes
## Builder Pattern Features
* Step-by-step object construction
* Fluent API using `return this`
* Two concrete builders
* Two different representations of the same product
* Director with predefined configurations
* Immutable product
* Input validation
* Separation of construction logic from product representation
## Technologies
* Java
* IntelliJ IDEA
* Git
* GitHub
## How to Run
Run the `Main.java` file from the `robot` package.
The program demonstrates both robot object creation and text specification generation.
## Author
Khanzada Nyshanbek Adylkyzy
