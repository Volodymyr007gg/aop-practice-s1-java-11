package homework.h12;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void example1ReturnsThree() {
    assertThat(solution.heightChecker(new int[] {1, 1, 4, 2, 1, 3})).isEqualTo(3);
  }

  @Test
  void example2ReturnsFive() {
    assertThat(solution.heightChecker(new int[] {5, 1, 2, 3, 4})).isEqualTo(5);
  }

  @Test
  void example3ReturnsZero() {
    assertThat(solution.heightChecker(new int[] {1, 2, 3, 4, 5})).isEqualTo(0);
  }

  @Test
  void singleElementReturnsZero() {
    assertThat(solution.heightChecker(new int[] {1})).isEqualTo(0);
  }

  @Test
  void allEqualElementsReturnZero() {
    assertThat(solution.heightChecker(new int[] {2, 2, 2})).isEqualTo(0);
  }

  @Test
  void reversedOrderKeepsOnlyMiddleInPlace() {
    assertThat(solution.heightChecker(new int[] {5, 4, 3, 2, 1})).isEqualTo(4);
  }

  @Test
  void maxSizeDescendingInputReturnsHundred() {
    int[] heights = IntStream.rangeClosed(1, 100).map(i -> 101 - i).toArray();
    assertThat(solution.heightChecker(heights)).isEqualTo(100);
  }
}
