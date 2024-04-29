package midterm.nikoloz_beridze_3.task3;

public class GHSMSTester {
    public static void main(String[] args) {
        GHSMS ghsms = new GHSMS();

        HeritageSite mtskheta = new HeritageSite("Mtskheta", "Mtskheta", "4th-6th century AD", "Medieval Georgian architecture", "Ancient capital and religious center of Georgia");
        HeritageSite uplistsikhe = new HeritageSite("Uplistsikhe Cave Town", "Shida Kartli", "1st millennium BC", "Rock-cut architecture", "Ancient rock-hewn town and cave complex");
        HeritageSite gelatiMonastery = new HeritageSite("Gelati Monastery", "Kutaisi", "12th century AD", "Medieval Georgian architecture", "Monastic complex and a UNESCO World Heritage Site");

        ghsms.addHeritagesite(mtskheta);
        ghsms.addHeritagesite(uplistsikhe);
        ghsms.addHeritagesite(gelatiMonastery);

        ghsms.removeHeritagesite(uplistsikhe);

        ghsms.printHeritagesites();
    }
}
