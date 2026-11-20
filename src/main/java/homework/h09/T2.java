package homework.h09;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
@SuppressWarnings("unused")
public class T2 {

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = 0;
    for (int candy : candies) {
      if (candy > max) {
        max = candy;
      }
    }

    List<Boolean> result = new ArrayList<>(candies.length);
    for (int candy : candies) {
      result.add(candy + extraCandies >= max);
    }
    return result;
  }
}