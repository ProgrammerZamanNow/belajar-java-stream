package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {

  @Test
  void testMax() {
    List.of("Eko", "Kurniawan", "Khannedy", "Programmer", "Zaman", "Now").stream()
        .max(Comparator.naturalOrder())
        .ifPresent(System.out::println);
  }

  @Test
  void testMin() {
    List.of("Eko", "Kurniawan", "Khannedy", "Programmer", "Zaman", "Now").stream()
        .min(Comparator.naturalOrder())
        .ifPresent(System.out::println);
  }

  @Test
  void testCount() {
    long count = List.of("Eko", "Kurniawan", "Khannedy", "Programmer", "Zaman", "Now").stream()
        .count();
    System.out.println(count);
  }

  @Test
  void testSum() {
    var result = List.of(1, 2, 3, 4, 5).stream()
        .reduce(0, (value, item) -> value + item);

    System.out.println(result);

    // 0
    // 1. value=0 item=1 = 1
    // 2. value=1 item=2 = 3
    // 3. value=3 item=3 = 6
    // 4. value=6 item=4 = 10
    // 5. value=10 item=5 = 15
  }

  @Test
  void testFactorial() {
    var factorial = List.of(1, 2, 3, 4, 5).stream()
        .reduce(1, (value, item) -> value * item);

    System.out.println(factorial);

    // 1
    // 1. value=1 item=1 = 1
    // 2. value=1 item=2 = 2
    // 3. value=2 item=3 = 6
    // 4. value=6 item=4 = 24
    // 5. value=24 item=5 = 120
  }
}
