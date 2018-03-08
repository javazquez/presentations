import java.util.stream.Stream;

public class ParallelExample {
  public static void main(String[] args) {
      Long answer = Stream.iterate(1L, n  ->  n  + 1)
          .limit(100)
          .parallel()
          .reduce(0L, Long::sum);

      System.out.println(answer);
  }
}
