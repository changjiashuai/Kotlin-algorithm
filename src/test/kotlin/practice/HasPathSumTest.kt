package practice

import org.junit.Before
import org.junit.Test

class HasPathSumTest {

    var rootNode: TreeNode? = null

    @Before
    fun before() {
        rootNode = TreeNode(
            5,
            left = TreeNode(
                4,
                left = TreeNode(
                    11,
                    left = TreeNode(7),
                    right = TreeNode(2)
                )
            ),
            right = TreeNode(
                8,
                left = TreeNode(13),
                right = TreeNode(
                    4,
                    right = TreeNode(1)
                )
            )
        )
    }


    @Test
    fun test() {
        val result = hasPathSum(rootNode, 22)
        assert(result)
    }
}