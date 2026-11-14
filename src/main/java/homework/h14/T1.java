package homework.h14;

// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class T1 {

  public String removeDuplicates(String s) {
    StringBuilder stack = new StringBuilder();
    for (char c : s.toCharArray()) {
      int last = stack.length() - 1;
      if (last >= 0 && stack.charAt(last) == c) {
        stack.deleteCharAt(last);
      } else {
        stack.append(c);
      }
    }
    return stack.toString();
  }
}
