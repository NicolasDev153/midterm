package midterm.nikoloz_beridze_3.task1;

import java.util.ArrayList;
import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    // TODO change studentName to your name
    private String studentName = "Nikoloz Beridze";

    @Override
    public String getInnovation1() {
        return "Innovation1";
    }

    @Override
    public String getRock2() {
        return "Rock2";
    }

    @Override
    public String toString() {
        return "Student Name: " + studentName + "\n"
                + "Innovation 1: " + getInnovation1() + "\n"
                + "Rock 2: " + getRock2();
        //return result;
    }

    @Override
    public String methodHealth3(String argTradition5) {
        return "Health method output for " + argTradition5;
    }

    @Override
    public List<String> methodChemicalop4(String argThread6) {
        List<String> result = new ArrayList<>();
        result.add("Chemical operation output for " + argThread6);
        return result;
    }
}
