package kwic;

public class MasterControl {

    public static void main() {
        Input.read("how are you?I am fine and you?");
        CircularShift.shift();
        Alphabetizing.alphabetizing();
        Output.output();
    }

}
