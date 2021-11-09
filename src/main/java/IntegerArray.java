import java.util.stream.Stream;

public class IntegerArray {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String[] ss = sb.toString().split("");

        int[] arr = Stream.of(ss).mapToInt(Integer::parseInt).toArray();

        return arr;
    }

    public static void main(String[] args) {
        IntegerArray method = new IntegerArray();
        for (int i : method.solution(12345)) {
            System.out.print(i + " ");
        }
    }
}
