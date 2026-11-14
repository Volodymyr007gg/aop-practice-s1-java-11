package homework.h16;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void example1() {
    int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
    int[][] expected = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
    assertArrayEquals(expected, solution.floodFill(image, 1, 1, 2));
  }

  @Test
  void sameColorKeepsImage() {
    int[][] image = {{0, 0, 0}, {0, 0, 0}};
    int[][] expected = {{0, 0, 0}, {0, 0, 0}};
    assertArrayEquals(expected, solution.floodFill(image, 0, 0, 0));
  }

  @Test
  void singleCell() {
    int[][] image = {{0}};
    int[][] expected = {{3}};
    assertArrayEquals(expected, solution.floodFill(image, 0, 0, 3));
  }

  @Test
  void diagonalCellsAreNotConnected() {
    int[][] image = {{1, 0}, {0, 1}};
    int[][] expected = {{5, 0}, {0, 1}};
    assertArrayEquals(expected, solution.floodFill(image, 0, 0, 5));
  }

  @Test
  void fillsWholeImage() {
    int[][] image = {{1, 1}, {1, 1}};
    int[][] expected = {{9, 9}, {9, 9}};
    assertArrayEquals(expected, solution.floodFill(image, 1, 0, 9));
  }

  @Test
  void startFromBorderCell() {
    int[][] image = {{0, 0, 0}, {0, 1, 1}};
    int[][] expected = {{2, 2, 2}, {2, 1, 1}};
    assertArrayEquals(expected, solution.floodFill(image, 0, 2, 2));
  }
}
