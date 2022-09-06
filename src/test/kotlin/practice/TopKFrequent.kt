package practice

import org.junit.Assert
import org.junit.Test

class TopKFrequent {

    @Test
    fun test() {
        Assert.assertArrayEquals(intArrayOf(2, 1), topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2))
        Assert.assertArrayEquals(intArrayOf(1, 2), topKFrequent(intArrayOf(1, 2), 2))
    }
}