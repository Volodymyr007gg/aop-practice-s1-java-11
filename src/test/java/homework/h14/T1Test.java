package homework.h14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void example1() {
    assertEquals("ca", new T1().removeDuplicates("abbaca"));
  }

  @Test
  void example2() {
    assertEquals("ay", new T1().removeDuplicates("azxxzy"));
  }

  @Test
  void allRemoved() {
    assertEquals("", new T1().removeDuplicates("aa"));
  }

  @Test
  void singleChar() {
    assertEquals("a", new T1().removeDuplicates("a"));
  }

  @Test
  void noDuplicates() {
    assertEquals("abc", new T1().removeDuplicates("abc"));
  }
}
