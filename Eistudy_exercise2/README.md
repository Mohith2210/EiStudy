# Mars Rover Simulation Project

This project is a simulation of a Mars Rover exploring a grid on Mars. The rover can receive commands to move, turn left, or turn right. This README provides an overview of the files and their purpose.

## File Structure

### Core Simulation Files
- MarsRoverSimulation.java / MarsRoverSimulation.class: 
  The main class that runs the Mars Rover simulation. It orchestrates the entire simulation by initializing the rover, grid, and handling commands.

- Grid.java / Grid.class: 
  This class represents the grid on which the rover moves. It stores information about the grid’s dimensions and checks the rover's position within the grid.

- Rover.java / Rover.class: 
  The `Rover` class models the Mars Rover itself. It handles the rover’s state, including its position, direction, and the commands it executes.

- Position.java / Position.class: 
  This class manages the rover's current coordinates (X, Y) on the grid.

- **Direction.java / Direction.class**: 
  Handles the direction the rover is facing (North, East, South, West). It contains logic for changing directions when turning left or right.

### Command Pattern Implementation
- Command.java / Command.class: 
  This interface defines a common method for executing commands on the rover. It is part of the Command design pattern to decouple the request for an action from the object that performs it.

- MoveCommand.java / MoveCommand.class: 
  This class implements the `Command` interface. It moves the rover forward by one unit in the direction it is currently facing.

- TurnLeftCommand.java / TurnLeftCommand.class: 
  Implements the `Command` interface. It changes the rover’s direction to the left (counterclockwise).

- TurnRightCommand.java / TurnRightCommand.class: 
  Implements the `Command` interface. It changes the rover’s direction to the right (clockwise).

### Additional Classes
- Logger.class: 
  A utility class used for logging the simulation's actions and errors. It keeps track of commands executed, rover's movements, and any exceptional cases.

- RoverException.class: 
  A custom exception class that handles errors during the rover's operation (e.g., invalid commands or moving out of bounds).





## Usage

1. Running the Simulation: 
   To run the simulation, compile the Java files using the command:
   ```bash
   javac MarsRoverSimulation.java
