package homework.h12;

// https://leetcode.com/problems/relative-sort-array/
public class T2 {

  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int[] count = new int[1001];
    for (int x : arr1) {
      count[x]++;
    }

    int[] result = new int[arr1.length];
    int idx = 0;

    for (int v : arr2) {
      while (count[v] > 0) {
        result[idx++] = v;
        count[v]--;
      }
    }

    for (int v = 0; v <= 1000; v++) {
      while (count[v] > 0) {
        result[idx++] = v;
        count[v]--;
      }
    }
    return result;
  }
}
