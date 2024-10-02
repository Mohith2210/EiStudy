public class Rover {
    private Position position;
    private Direction direction;
    private final Grid grid;

    public Rover(Position position, Direction direction, Grid grid) {
        this.position = position;
        this.direction = direction;
        this.grid = grid;
    }

    public void move() {
        Position newPosition = calculateNewPosition();
        if (grid.isValidPosition(newPosition)) {
            position = newPosition;
            System.out.println("Rover moved to " + position.getX() + "," + position.getY());
        } else {
            System.out.println("Movement blocked: " + newPosition.getX() + "," + newPosition.getY());
        }
    }

    private Position calculateNewPosition() {
        return switch (direction) {
            case NORTH -> new Position(position.getX(), position.getY() + 1);
            case EAST -> new Position(position.getX() + 1, position.getY());
            case SOUTH -> new Position(position.getX(), position.getY() - 1);
            case WEST -> new Position(position.getX() - 1, position.getY());
        };
    }

    public void turnLeft() {
        direction = direction.turnLeft();
        System.out.println("Rover turned left, now facing " + direction);
    }

    public void turnRight() {
        direction = direction.turnRight();
        System.out.println("Rover turned right, now facing " + direction);
    }

    public String getStatusReport() {
        return String.format("Rover is at (%d, %d) facing %s. No Obstacles detected.", 
                             position.getX(), position.getY(), direction);
    }
}