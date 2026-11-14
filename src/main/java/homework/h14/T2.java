package homework.h14;

import java.util.ArrayDeque;
import java.util.Deque;

// https://leetcode.com/problems/implement-queue-using-stacks/
public class T2 {
  private final Deque<Integer> input = new ArrayDeque<>();
  private final Deque<Integer> output = new ArrayDeque<>();

  public void push(int x) {
    input.push(x);
  }

  public int pop() {
    moveIfNeeded();
    return output.pop();
  }

  public int peek() {
    moveIfNeeded();
    return output.getFirst();
  }

  public boolean empty() {
    return input.isEmpty() && output.isEmpty();
  }

  private void moveIfNeeded() {
    if (output.isEmpty()) {
      while (!input.isEmpty()) {
        output.push(input.pop());
      }
    }
  }
}
