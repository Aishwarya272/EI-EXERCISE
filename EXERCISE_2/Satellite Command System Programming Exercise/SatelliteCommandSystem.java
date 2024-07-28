import java.util.Scanner;

public class SatelliteCommandSystem {
    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        CommandInvoker invoker = new CommandInvoker();
        Scanner scanner = new Scanner(System.in);

        String running = " ";

        while (running!="Exit") {
            System.out.println("Select the option:\n"
                    + "1. Rotate\n"
                    + "2. Activate Panels\n"
                    + "3. Deactivate Panels\n"
                    + "4. Collect Data\n"
                    + "5. Execute Commands\n"
                    + "6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter direction (North, South, East, West): ");
                    String direction = scanner.nextLine();
                    invoker.addCommand(new RotateCommand(satellite, direction));
                    break;
                case 2:
                    invoker.addCommand(new ActivatePanelsCommand(satellite));
                    break;
                case 3:
                    invoker.addCommand(new DeactivatePanelsCommand(satellite));
                    break;
                case 4:
                    invoker.addCommand(new CollectDataCommand(satellite));
                    break;
                case 5:
                    invoker.executeCommands();
                    System.out.println(satellite);
                    break;
                case 6:
                    running = "Exit";
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}
