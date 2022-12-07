package kwic;

public class CircularShift {

    public static void shift() {
        int pairCursor = 0;
        for (int i = 0; i < GlobalData.lineStartIndex.length; ++i) {
            GlobalData.shifts[pairCursor++] = new WordStartIndex_OriginLine_Pair(
                    GlobalData.lineStartIndex[i]
                    , GlobalData.lineStartIndex[i]);
        }
    }
}
