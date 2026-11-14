package homework.h15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void example() {
    TreeNode root =
        new TreeNode(
            4,
            new TreeNode(2, new TreeNode(1), new TreeNode(3)),
            new TreeNode(7, new TreeNode(6), new TreeNode(9)));

    TreeNode result = new T1().invertTree(root);

    assertEquals(4, result.val);
    assertEquals(7, result.left.val);
    assertEquals(2, result.right.val);
    assertEquals(9, result.left.left.val);
    assertEquals(6, result.left.right.val);
    assertEquals(3, result.right.left.val);
    assertEquals(1, result.right.right.val);
  }

  @Test
  void emptyTree() {
    assertNull(new T1().invertTree(null));
  }

  @Test
  void singleNode() {
    TreeNode result = new T1().invertTree(new TreeNode(1));
    assertEquals(1, result.val);
    assertNull(result.left);
    assertNull(result.right);
  }
}
