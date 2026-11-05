package homework.h04;

// advanced
// https://leetcode.com/problems/number-complement/
public class T2 {

  public int findComplement(int num) {
    int mask = (Integer.highestOneBit(num) << 1) - 1;
    return num ^ mask;
  }
}
