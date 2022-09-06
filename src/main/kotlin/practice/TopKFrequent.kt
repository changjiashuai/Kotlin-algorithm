package practice

import java.util.PriorityQueue
import java.util.TreeMap

/**
 * 给定一个整数数组 nums 和一个整数 k ，请返回其中出现频率前 k 高的元素。可以按 任意顺序 返回答案。
 *
 * 示例 1:
 *      输入: nums = [1,1,1,2,2,3], k = 2
 *      输出: [1,2]
 *
 * 示例 2:
 *      输入: nums = [1], k = 1
 *      输出: [1]
 *
 * 示例 3:
 *      输入：nums = [1,2], k = 2
 *      输出：[1,2]
 *
 */
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val map = hashMapOf<Int, Int>()
    for (num in nums) {
        if (map.containsKey(num)) {
            map[num] = map[num]!! + 1
        } else {
            map[num] = 1
        }
    }
    val queue = PriorityQueue<Pair<Int, Int>> { o1, o2 ->
        o1.second - o2.second
    }
    for ((key, value) in map.entries) {
        if (queue.size == k) {
            if (queue.peek().second < value) {
                queue.poll()
                queue.offer(Pair(key, value))
            }
        } else {
            queue.offer(Pair(key, value))
        }
    }
    val list = mutableListOf<Int>()
    for (i in 0 until k) {
        list.add(queue.poll().first)
    }
    return list.toIntArray()
}