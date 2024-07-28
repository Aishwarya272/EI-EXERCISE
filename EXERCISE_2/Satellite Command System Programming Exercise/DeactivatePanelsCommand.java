import java.util.logging.Logger;

public class DeactivatePanelsCommand implements Command {
    private static final Logger logger = Logger.getLogger(DeactivatePanelsCommand.class.getName());
    private Satellite satellite;

    public DeactivatePanelsCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() throws Exception {
        try {
            satellite.setSolarPanelsActive(false);
            logger.info("Executed DeactivatePanelsCommand");
        } catch (Exception e) {
            logger.severe("Error executing DeactivatePanelsCommand: " + e.getMessage());
            throw e;
        }
    }
}
