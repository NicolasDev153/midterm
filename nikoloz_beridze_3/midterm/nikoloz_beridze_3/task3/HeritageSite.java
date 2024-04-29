package midterm.nikoloz_beridze_3.task3;
public class HeritageSite {
    private String siteName;
    private String location;
    private String historicalPeriod;
    private String architecturalStyle;
    private String description;

    // Constructor for HeritageSite
    public HeritageSite(String siteName, String location, String historicalPeriod, String architecturalStyle, String description) {
        this.siteName = siteName;
        this.location = location;
        this.historicalPeriod = historicalPeriod;
        this.architecturalStyle = architecturalStyle;
        this.description = description;
    }

    // Getters for the above declared, corresponding variables
    public String getSiteName() {
        return siteName;
    }

    public String getLocation() {
        return location;
    }

    public String getHistoricalPeriod() {
        return historicalPeriod;
    }

    public String getArchitecturalStyle() {
        return architecturalStyle;
    }

    public String getDescription() {
        return description;
    }
}