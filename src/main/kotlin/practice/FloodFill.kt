package practice

/**
 * An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
 * You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].
 * To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel,
 * plus any pixels connected 4-directionally to those pixels (also with the same color), and so on.
 * Replace the color of all the aforementioned pixels with color.
 *
 * Return the modified image after performing the flood fill.
 *
 * input:
 *      [[1,1,1],[1,1,0],[1,0,1]]
 *      1
 *      1
 *      2
 *
 * output:
 *      [[2,2,2],[2,2,0],[2,0,1]]
 */

fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
    val oldColor = image[sr][sc]
    if (oldColor != color) {
        dfs(image, sr, sc, oldColor, color)
    }
    return image
}

private fun dfs(image: Array<IntArray>, sr: Int, sc: Int, oldColor: Int, newColor: Int) {

    if (sr < 0 || sr >= image.size
        || sc < 0 || sc >= image[0].size
        || image[sr][sc] != oldColor
    ) {
        return
    }

    image[sr][sc] = newColor

    dfs(image, sr - 1, sc, oldColor, newColor)
    dfs(image, sr + 1, sc, oldColor, newColor)
    dfs(image, sr, sc - 1, oldColor, newColor)
    dfs(image, sr, sc + 1, oldColor, newColor)
}