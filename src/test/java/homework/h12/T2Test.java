package homework.h12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void example1SortsByRelativeOrder() {
    int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
    int[] arr2 = {2, 1, 4, 3, 9, 6};
    assertThat(solution.relativeSortArray(arr1, arr2))
        .containsExactly(2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19);
  }

  @Test
  void example2PutsMissingElementsAtEndInAscendingOrder() {
    int[] arr1 = {28, 6, 22, 8, 44, 17};
    int[] arr2 = {22, 28, 8, 6};
    assertThat(solution.relativeSortArray(arr1, arr2)).containsExactly(22, 28, 8, 6, 17, 44);
  }

  @Test
  void arr2ContainsAllElementsOfArr1() {
    assertThat(solution.relativeSortArray(new int[] {3, 1, 2}, new int[] {2, 3, 1}))
        .containsExactly(2, 3, 1);
  }

  @Test
  void duplicatesOfSingleValueArePreserved() {
    assertThat(solution.relativeSortArray(new int[] {5, 5, 5}, new int[] {5}))
        .containsExactly(5, 5, 5);
  }

  @Test
  void remainingElementsAreSortedAscending() {
    assertThat(solution.relativeSortArray(new int[] {9, 7, 8, 1}, new int[] {1}))
        .containsExactly(1, 7, 8, 9);
  }

  @Test
  void boundaryValuesZeroAndThousandAreHandled() {
    assertThat(solution.relativeSortArray(new int[] {1000, 0, 500, 0}, new int[] {500}))
        .containsExactly(500, 0, 0, 1000);
  }

  @Test
  void singleElementReturnsSameElement() {
    assertThat(solution.relativeSortArray(new int[] {0}, new int[] {0})).containsExactly(0);
  }
}
