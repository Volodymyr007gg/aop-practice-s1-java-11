package homework.h16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void example1() {
    assertEquals(2, solution.findJudge(2, new int[][] {{1, 2}}));
  }

  @Test
  void example2() {
    assertEquals(3, solution.findJudge(3, new int[][] {{1, 3}, {2, 3}}));
  }

  @Test
  void judgeTrustsSomeone() {
    assertEquals(-1, solution.findJudge(3, new int[][] {{1, 3}, {2, 3}, {3, 1}}));
  }

  @Test
  void singlePerson() {
    assertEquals(1, solution.findJudge(1, new int[][] {}));
  }

  @Test
  void noOneIsTrustedByAll() {
    assertEquals(-1, solution.findJudge(3, new int[][] {{1, 2}, {2, 3}}));
  }

  @Test
  void noTrustWithTwoPeople() {
    assertEquals(-1, solution.findJudge(2, new int[][] {}));
  }

  @Test
  void fourPeople() {
    assertEquals(3, solution.findJudge(4, new int[][] {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}}));
  }
}
