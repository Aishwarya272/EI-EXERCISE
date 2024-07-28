import java.util.logging.Logger;

public class ActivatePanelsCommand implements Command {
    private static final Logger logger = Logger.getLogger(ActivatePanelsCommand.class.getName());
    private Satellite satellite;

    public ActivatePanelsCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() throws Exception {
        try {
            satellite.setSolarPanelsActive(true);
            logger.info("Executed ActivatePanelsCommand");
        } catch (Exception e) {
            logger.severe("Error executing ActivatePanelsCommand: " + e.getMessage());
            throw e;
        }
    }
}
