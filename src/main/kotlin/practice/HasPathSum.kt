package practice

/**
 * Given the root of a binary tree and an integer targetSum,
 * return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

 * A leaf is a node with no children.
 *
 * Input:
 *      root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
 * Output:
 *      true
 *
 * Input:
 *      root = [1,2,3], targetSum = 5
 * Output:
 *      false
 */
fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    if (root == null) {
        return false
    }
    if (root.left == null && root.right == null) {
        return root.`val` == targetSum
    }
    return hasPathSum(root.left, targetSum - root.`val`) || hasPathSum(root.right, targetSum - root.`val`)
}

class TreeNode constructor(var `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null) {
}