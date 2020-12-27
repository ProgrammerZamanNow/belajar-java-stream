package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

  @Test
  void testLimit() {
    List.of("Eko", "Kurniawan", "Khannedy", "Budi", "Joko").stream()
        .limit(2)
        .forEach(System.out::println);
  }

  @Test
  void testSkip() {
    List.of("Eko", "Kurniawan", "Khannedy", "Budi", "Joko").stream()
        .skip(2)
        .forEach(System.out::println);
  }

  @Test
  void testTakeWhile() {
    List.of("Eko", "Edo", "Kurniawan", "Khannedy", "Budi", "Joko").stream()
        .takeWhile(name -> name.length() <= 4)
        .forEach(System.out::println);
  }

  @Test
  void testDropWhile() {
    List.of("Eko", "Edo", "Kurniawan", "Khannedy", "Budi", "Joko").stream()
        .dropWhile(name -> name.length() <= 4)
        .forEach(System.out::println);
  }

  @Test
  void testFindAny() {
    Optional<String> optional = List.of("Eko", "Edo", "Kurniawan", "Khannedy", "Budi", "Joko").stream()
        .findAny();

    optional.ifPresent(name -> {
      System.out.println(name);
    });
  }

  @Test
  void testFindFirst() {
    Optional<String> optional = List.of("Eko", "Edo", "Kurniawan", "Khannedy", "Budi", "Joko").stream()
        .findFirst();

    optional.ifPresent(name -> {
      System.out.println(name);
    });
  }
}
