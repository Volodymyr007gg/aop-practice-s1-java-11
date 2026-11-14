package homework.h13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void moreNegatives() {
    assertEquals(3, new T2().maximumCount(new int[] {-2, -1, -1, 1, 2, 3}));
  }

  @Test
  void morePositives() {
    assertEquals(3, new T2().maximumCount(new int[] {-3, -2, -1, 0, 0, 1, 2}));
  }

  @Test
  void onlyZeros() {
    assertEquals(0, new T2().maximumCount(new int[] {0, 0, 0}));
  }

  @Test
  void allPositive() {
    assertEquals(4, new T2().maximumCount(new int[] {5, 20, 66, 1314}));
  }
}
