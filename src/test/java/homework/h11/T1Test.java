package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void example1ReturnsTwo() {
    assertThat(solution.missingNumber(new int[] {3, 0, 1})).isEqualTo(2);
  }

  @Test
  void example2ReturnsTwo() {
    assertThat(solution.missingNumber(new int[] {0, 1})).isEqualTo(2);
  }

  @Test
  void example3ReturnsEight() {
    assertThat(solution.missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
  }

  @Test
  void singleElementZeroReturnsOne() {
    assertThat(solution.missingNumber(new int[] {0})).isEqualTo(1);
  }

  @Test
  void singleElementOneReturnsZero() {
    assertThat(solution.missingNumber(new int[] {1})).isEqualTo(0);
  }

  @Test
  void maxSizeInputFindsMissingNumber() {
    int[] nums = IntStream.rangeClosed(0, 10_000).filter(v -> v != 5000).toArray();
    assertThat(solution.missingNumber(nums)).isEqualTo(5000);
  }
}
