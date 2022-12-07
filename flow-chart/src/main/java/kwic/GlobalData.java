package kwic;

public class GlobalData {
    public static char[] originWords;
    public static int[] lineStartIndex;
    public static WordStartIndex_OriginLine_Pair[] shifts;
}

class WordStartIndex_OriginLine_Pair {
    public int wordStartIndex;
    public int originLine;

    public WordStartIndex_OriginLine_Pair(int wordStartIndex, int originLine) {
        this.wordStartIndex = wordStartIndex;
        this.originLine = originLine;
    }


}
