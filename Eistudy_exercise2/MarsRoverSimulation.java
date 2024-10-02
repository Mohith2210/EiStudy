import java.util.*;

public class MarsRoverSimulation {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Grid grid = initializeGrid();
            Rover rover = initializeRover(grid);
            Map<Character, Command> commands = initializeCommands();

            runSimulation(rover, commands);
        } catch (Exception e) {
            System.err.println("Fatal error in simulation: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static Grid initializeGrid() {
        System.out.println("Initializing grid...");
        Set<Position> obstacles = new HashSet<>(Arrays.asList(
            new Position(2, 2),
            new Position(3, 5)
        ));
        return new Grid(10, 10, obstacles);
    }

    private static Rover initializeRover(Grid grid) {
        System.out.println("Initializing rover...");
        return new Rover(new Position(0, 0), Direction.NORTH, grid);
    }

    private static Map<Character, Command> initializeCommands() {
        System.out.println("Initializing commands...");
        return Map.of(
            'M', new MoveCommand(),
            'L', new TurnLeftCommand(),
            'R', new TurnRightCommand()
        );
    }

    private static void runSimulation(Rover rover, Map<Character, Command> commands) {
        System.out.println("Starting simulation...");
        while (true) {
            try {
                System.out.print("Enter commands (or 'exit' to quit): ");
                String input = scanner.nextLine().toUpperCase();
                
                if ("EXIT".equals(input)) {
                    break;
                }

                for (char c : input.toCharArray()) {
                    Command command = commands.get(c);
                    if (command == null) {
                        throw new IllegalArgumentException("Invalid command: " + c);
                    }
                    command.execute(rover);
                }
                System.out.println(rover.getStatusReport());
            } catch (IllegalArgumentException e) {
                System.err.println("Error executing command: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Unexpected error: " + e.getMessage());
                e.printStackTrace();
            }
        }
        System.out.println("Simulation ended.");
    }
}