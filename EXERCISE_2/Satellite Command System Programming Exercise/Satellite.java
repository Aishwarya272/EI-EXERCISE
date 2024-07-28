import java.util.logging.Logger;

public class Satellite {
    private static final Logger logger = Logger.getLogger(Satellite.class.getName());

    private String orientation;
    private boolean solarPanelsActive;
    private int dataCollected;

    public Satellite() {
        this.orientation = "North";
        this.solarPanelsActive = false;
        this.dataCollected = 0;
        logger.info("Satellite initialized: " + this.toString());
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
        logger.info("Orientation set to " + orientation);
    }

    public boolean areSolarPanelsActive() {
        return solarPanelsActive;
    }

    public void setSolarPanelsActive(boolean solarPanelsActive) {
        this.solarPanelsActive = solarPanelsActive;
        logger.info("Solar Panels set to " + (solarPanelsActive ? "Active" : "Inactive"));
    }

    public int getDataCollected() {
        return dataCollected;
    }

    public void collectData() {
        if (solarPanelsActive) {
            this.dataCollected += 10;
            logger.info("Data collected. Total Data: " + dataCollected);
        } else {
            logger.warning("Attempted to collect data with inactive solar panels.");
            throw new IllegalStateException("Solar panels must be active to collect data.");
        }
    }

    @Override
    public String toString() {
        return "Satellite [Orientation=" + orientation + ", Solar Panels=" + (solarPanelsActive ? "Active" : "Inactive") + ", Data Collected=" + dataCollected + "]";
    }
}
