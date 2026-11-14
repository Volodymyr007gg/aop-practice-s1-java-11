package homework.h13;

// https://leetcode.com/problems/first-bad-version/
public class T1 {
  private final int bad;

  public T1(int bad) {
    this.bad = bad;
  }

  public boolean isBadVersion(int version) {
    return version >= bad;
  }

  public int firstBadVersion(int n) {
    int left = 1;
    int right = n;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (isBadVersion(mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }
}
