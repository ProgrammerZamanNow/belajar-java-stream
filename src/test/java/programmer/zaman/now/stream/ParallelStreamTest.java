package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class ParallelStreamTest {

  @Test
  void testSequential() {
    Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .forEach(number -> {
          System.out.println(Thread.currentThread().getName() + " : " + number);
        });
  }

  @Test
  void testParallel() {
    Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .parallel()
        .forEach(number -> {
          System.out.println(Thread.currentThread().getName() + " : " + number);
        });
  }
}
