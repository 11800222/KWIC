package kwic;

public class client {

    public static void main(String[] dw) {
        Test.a = 4;
        System.out.println(Test.a);
    }
}

class F {
    private void test() {
    }
}

class S extends client {
    public void test() {
        try {
            throw new RuntimeException();
        } finally {
//            return;
        }
    }
}
