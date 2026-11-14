package homework.h15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void example1() {
    TreeNode root =
        new TreeNode(
            10,
            new TreeNode(5, new TreeNode(3), new TreeNode(7)),
            new TreeNode(15, null, new TreeNode(18)));

    assertEquals(32, new T2().rangeSumBST(root, 7, 15));
  }

  @Test
  void example2() {
    TreeNode root =
        new TreeNode(
            10,
            new TreeNode(
                5, new TreeNode(3, new TreeNode(1), null), new TreeNode(7, new TreeNode(6), null)),
            new TreeNode(15, new TreeNode(13), new TreeNode(18)));

    assertEquals(23, new T2().rangeSumBST(root, 6, 10));
  }

  @Test
  void singleNode() {
    assertEquals(5, new T2().rangeSumBST(new TreeNode(5), 5, 5));
  }
}
