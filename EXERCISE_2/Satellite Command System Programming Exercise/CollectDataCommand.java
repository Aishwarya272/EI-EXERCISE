import java.util.logging.Logger;

public class CollectDataCommand implements Command {
    private static final Logger logger = Logger.getLogger(CollectDataCommand.class.getName());
    private Satellite satellite;

    public CollectDataCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() throws Exception {
        try {
            satellite.collectData();
            logger.info("Executed CollectDataCommand");
        } catch (Exception e) {
            logger.severe("Error executing CollectDataCommand: " + e.getMessage());
            throw e;
        }
    }
}
