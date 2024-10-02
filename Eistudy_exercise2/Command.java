public interface Command {
    void execute(Rover rover);
}

class MoveCommand implements Command {
    public void execute(Rover rover) {
        rover.move();
    }
}

class TurnLeftCommand implements Command {
    public void execute(Rover rover) {
        rover.turnLeft();
    }
}

class TurnRightCommand implements Command {
    public void execute(Rover rover) {
        rover.turnRight();
    }
}