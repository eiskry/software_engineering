package task2;
public class FibTest {
    public static void main(String[] args) {
        // 10個のフィボナッチ数を印刷
        for (int i : new FibSequence(10)) {
            System.out.println(i);
        }
    }
}