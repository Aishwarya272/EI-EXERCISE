import java.util.logging.Logger;

public class RotateCommand implements Command {
    private static final Logger logger = Logger.getLogger(RotateCommand.class.getName());
    private Satellite satellite;
    private String direction;

    public RotateCommand(Satellite satellite, String direction) {
        this.satellite = satellite;
        this.direction = direction;
    }

    @Override
    public void execute() throws Exception {
        try {
            satellite.setOrientation(direction);
            logger.info("Executed RotateCommand: " + direction);
        } catch (Exception e) {
            logger.severe("Error executing RotateCommand: " + e.getMessage());
            throw e;
        }
    }
}
