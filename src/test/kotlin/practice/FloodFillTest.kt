package practice

import org.junit.Assert
import org.junit.Test

class FloodFillTest {

    @Test
    fun test() {
        val image = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 0, 1))

        Assert.assertArrayEquals(
            floodFill(image, 1, 1, 2),
            arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 2, 0), intArrayOf(2, 0, 1))
        )
    }
}