package homework.h11;

// https://leetcode.com/problems/majority-element/
public class T2 {

  public int majorityElement(int[] nums) {
    int candidate = 0;
    int count = 0;
    for (int x : nums) {
      if (count == 0) {
        candidate = x;
      }
      count += (x == candidate) ? 1 : -1;
    }
    return candidate;
  }
}
