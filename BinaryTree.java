package src;

public class BinaryTree {
  TreeNode root;

  public TreeNode insert(TreeNode node, int value) {
    if (root == null) {
      return new TreeNode(value);
    }

    if (value < root.data) {
      root.left = insert(node, value);
    } else if (value > root.data) {
      root.right = insert(node, value);
    } else {
      return root;
    }

    return root;
  }
}
