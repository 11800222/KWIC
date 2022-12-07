package kwic;

/**
 * Hello world!
 */
public class Input {
    public static void read(String dataLines) {
        GlobalData.originWords = dataLines.toCharArray();
        boolean begin = true;
        int shift = 0;
        for (int i = 0; i < dataLines.toCharArray().length; ++i) {
            if (dataLines.toCharArray()[i] == '.') {
                begin = true;
            }
            if (begin) {
                GlobalData.lineStartIndex[shift++] = i;
                begin = false;
            }
        }
    }
}
