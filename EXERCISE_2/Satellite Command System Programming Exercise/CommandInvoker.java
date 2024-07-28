import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CommandInvoker {
    private static final Logger logger = Logger.getLogger(CommandInvoker.class.getName());
    private List<Command> commandQueue;

    public CommandInvoker() {
        commandQueue = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commandQueue.add(command);
    }

    public void executeCommands() {
        for (Command command : commandQueue) {
            int retries = 3;
            boolean success = false;
            while (retries > 0 && !success) {
                try {
                    command.execute();
                    success = true;
                } catch (Exception e) {
                    retries--;
                    logger.warning("Retrying command. Retries left: " + retries);
                    if (retries == 0) {
                        logger.severe("Command execution failed after retries: " + e.getMessage());
                    }
                }
            }
        }
    }
}
