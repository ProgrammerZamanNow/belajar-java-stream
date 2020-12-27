package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {

  @Test
  void testCreateStreamBuilder() {

    Stream.Builder<String> builder = Stream.builder();
    builder.accept("Eko");
    builder.add("Kurniawan").add("Khannedy");

    Stream<String> stream = builder.build();
    stream.forEach(System.out::println);

  }

  @Test
  void testCreateStreamBuilderSimplify() {
    Stream<Object> stream = Stream.builder()
        .add("Eko").add("Kurniawan").add("Khannedy").build();

    stream.forEach(System.out::println);
  }
}
