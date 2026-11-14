package homework.h13;

// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
public class T2 {

  public int maximumCount(int[] nums) {
    int negatives = firstIndexAtLeast(nums, 0);
    int positives = nums.length - firstIndexAtLeast(nums, 1);
    return Math.max(negatives, positives);
  }

  private int firstIndexAtLeast(int[] nums, int target) {
    int left = 0;
    int right = nums.length;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] >= target) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }
}
