package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void returnsExpectedForExample1() {
    assertThat(solution.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3))
            .containsExactly(true, true, true, false, true);
  }

  @Test
  void returnsExpectedForExample2() {
    assertThat(solution.kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1))
            .containsExactly(true, false, false, false, false);
  }

  @Test
  void returnsExpectedForExample3() {
    assertThat(solution.kidsWithCandies(new int[] {12, 1, 12}, 10))
            .containsExactly(true, false, true);
  }

  @Test
  void returnsTrueForSingleKid() {
    assertThat(solution.kidsWithCandies(new int[] {5}, 1)).containsExactly(true);
  }

  @Test
  void returnsTrueForSingleKidWithMinimumValues() {
    assertThat(solution.kidsWithCandies(new int[] {1}, 1)).containsExactly(true);
  }

  @Test
  void returnsTrueForAllWhenAllEqual() {
    assertThat(solution.kidsWithCandies(new int[] {3, 3, 3}, 1))
            .containsExactly(true, true, true);
  }

  @Test
  void returnsTrueOnlyForMaxWhenExtraCandiesIsMinimum() {
    assertThat(solution.kidsWithCandies(new int[] {1, 2, 3}, 1))
            .containsExactly(false, true, true);
  }

  @Test
  void returnsTrueWhenSumExactlyEqualsMax() {
    assertThat(solution.kidsWithCandies(new int[] {2, 5}, 3)).containsExactly(true, true);
  }

  @Test
  void returnsFalseWhenSumIsOneLessThanMax() {
    assertThat(solution.kidsWithCandies(new int[] {2, 5}, 2)).containsExactly(false, true);
  }

  @Test
  void returnsTrueForAllWhenExtraCandiesIsMaximum() {
    assertThat(solution.kidsWithCandies(new int[] {1, 50, 100}, 50))
            .containsExactly(true, true, true);
  }

  @Test
  void keepsOriginalOrder() {
    assertThat(solution.kidsWithCandies(new int[] {10, 1, 10, 1}, 5))
            .containsExactly(true, false, true, false);
  }

  @Test
  void returnsListOfSameSizeAsInput() {
    int[] candies = new int[100];
    Arrays.fill(candies, 100);

    assertThat(solution.kidsWithCandies(candies, 50)).hasSize(100).containsOnly(true);
  }

  @Test
  void handlesMaximumLengthWithSingleLeader() {
    int[] candies = new int[100];
    Arrays.fill(candies, 1);
    candies[99] = 100;

    assertThat(solution.kidsWithCandies(candies, 1))
            .hasSize(100)
            .endsWith(true)
            .containsOnlyOnce(true);
  }

  @Test
  void returnsNewListOnEachCall() {
    int[] candies = {1, 2, 3};

    assertThat(solution.kidsWithCandies(candies, 1))
            .isNotSameAs(solution.kidsWithCandies(candies, 1))
            .isEqualTo(Arrays.asList(false, true, true));
  }
}