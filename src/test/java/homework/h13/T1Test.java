package homework.h13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void example() {
    assertEquals(4, new T1(4).firstBadVersion(5));
  }

  @Test
  void singleVersion() {
    assertEquals(1, new T1(1).firstBadVersion(1));
  }

  @Test
  void firstIsBad() {
    assertEquals(1, new T1(1).firstBadVersion(10));
  }

  @Test
  void lastIsBad() {
    assertEquals(10, new T1(10).firstBadVersion(10));
  }

  @Test
  void largeN() {
    assertEquals(1702766719, new T1(1702766719).firstBadVersion(2126753390));
  }
}
