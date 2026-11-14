package homework.h14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void example() {
    T2 queue = new T2();
    queue.push(1);
    queue.push(2);
    assertEquals(1, queue.peek());
    assertEquals(1, queue.pop());
    assertFalse(queue.empty());
  }

  @Test
  void fifoOrder() {
    T2 queue = new T2();
    queue.push(1);
    queue.push(2);
    queue.push(3);
    assertEquals(1, queue.pop());
    queue.push(4);
    assertEquals(2, queue.pop());
    assertEquals(3, queue.pop());
    assertEquals(4, queue.pop());
    assertTrue(queue.empty());
  }

  @Test
  void emptyAtStart() {
    assertTrue(new T2().empty());
  }
}
