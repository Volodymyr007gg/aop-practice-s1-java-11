package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void example1ReturnsThree() {
    assertThat(solution.majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
  }

  @Test
  void example2ReturnsTwo() {
    assertThat(solution.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
  }

  @Test
  void singleElementReturnsItself() {
    assertThat(solution.majorityElement(new int[] {5})).isEqualTo(5);
  }

  @Test
  void candidateChangesWhenCounterDropsToZero() {
    assertThat(solution.majorityElement(new int[] {1, 2, 2})).isEqualTo(2);
  }

  @Test
  void handlesMinimumAndMaximumValues() {
    int[] nums = {-1_000_000_000, 1_000_000_000, 1_000_000_000};
    assertThat(solution.majorityElement(nums)).isEqualTo(1_000_000_000);
  }
}
