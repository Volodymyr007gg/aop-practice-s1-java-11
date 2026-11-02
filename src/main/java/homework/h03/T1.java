package homework.h03;

// base
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class T1 {

  public double averageSalary(int[] salary) {
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
    for (int s : salary) {
      sum += s;
      min = Math.min(min, s);
      max = Math.max(max, s);
    }
    return (double) (sum - min - max) / (salary.length - 2);
  }
}
