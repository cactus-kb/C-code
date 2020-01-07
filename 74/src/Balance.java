
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode (int val) {
        this.val = val;
    }
}

public class Balance {
    public boolean isBalance(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = getLength(root.left);
        int right = getLength(root.right);
        if (Math.abs(left - right) <= 1) {
            return isBalance(root.left) && isBalance(root.right);
        } else {
            return false;
        }
    }

    public int getLength(TreeNode root) {
        if (root != null) {
            int left = getLength(root.left);
            int right = getLength(root.right);
            if (left > right) {
                return left + 1;
            } else {
                return right + 1;
            }
        } else {
            return 0;
        }
    }
}
