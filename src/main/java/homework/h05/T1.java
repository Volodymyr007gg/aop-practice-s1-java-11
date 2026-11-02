package homework.h05;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
public class T1 {

  public int maxProductDifference(int[] nums) {
    Arrays.sort(nums);
    int length = nums.length;
    return nums[length - 1] * nums[length - 2] - nums[0] * nums[1];
  }
}
