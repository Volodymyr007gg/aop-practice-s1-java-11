package homework.h16;

// https://leetcode.com/problems/find-the-town-judge/
public class T2 {

  public int findJudge(int n, int[][] trust) {
    int[] balance = new int[n + 1];
    for (int[] pair : trust) {
      balance[pair[0]]--;
      balance[pair[1]]++;
    }
    for (int person = 1; person <= n; person++) {
      if (balance[person] == n - 1) {
        return person;
      }
    }
    return -1;
  }
}
