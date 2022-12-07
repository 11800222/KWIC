package kwic;

import java.util.Arrays;
import java.util.Comparator;

public class Alphabetizing {
    public static void alphabetizing() {
        Arrays.sort(GlobalData.shifts,
                Comparator.comparingInt(o -> GlobalData.originWords[o.wordStartIndex]));
    }
}
