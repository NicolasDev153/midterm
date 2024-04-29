package midterm.nikoloz_beridze_3.task3;

import java.util.ArrayList;
import java.util.List;

public class GHSMS {
    // Defining List for HeritageSite
    private List<HeritageSite> heritagesites;

    public GHSMS() {
        heritagesites = new ArrayList<>();
    }

    // Adds heritage site to the system
    public void addHeritagesite(HeritageSite heritagesite) {
        heritagesites.add(heritagesite);
    }

    // Removes heritage site from the system
    public boolean removeHeritagesite(HeritageSite heritagesite) {
        return heritagesites.remove(heritagesite);
    }

    public void printHeritagesites() {
        for (HeritageSite heritagesite : heritagesites) {
            System.out.println(heritagesite.getSiteName() + " - " + heritagesite.getLocation());
            System.out.println("Description: " + heritagesite.getDescription());
            System.out.println();
        }
    }
}
