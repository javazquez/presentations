import java.util.stream.Stream;

public class Infinite {
  public static void main(String[] args) {
    Stream.iterate(1L, n  ->  n  + 1)
    .limit(100)
    .forEach(System.out::print);
  }
}
