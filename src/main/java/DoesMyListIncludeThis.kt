class DoesMyListIncludeThis {
    fun include(arr: IntArray, item: Int): Boolean {
        return arr.contains(item)
    }

    fun includeBest(arr: IntArray, item: Int) = item in arr

    val includeVal = IntArray::contains
}