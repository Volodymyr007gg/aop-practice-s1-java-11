package homework.h11;

// https://leetcode.com/problems/missing-number/
public class T1 {

  public int missingNumber(int[] nums) {
    int n = nums.length;
    int expected = n * (n + 1) / 2;
    int sum = 0;
    for (int x : nums) {
      sum += x;
    }
    return expected - sum;
  }
}
