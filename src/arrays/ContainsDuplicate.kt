package arrays

fun main() {
    println(containsDuplicate(intArrayOf(2,3,4,5)))
    println(containsDuplicate(intArrayOf(2,3,2,5)))
    println(containsDuplicate(intArrayOf(2,2,2,2)))
    println(containsDuplicate(intArrayOf()))
}


fun containsDuplicate(nums: IntArray): Boolean {
    val hashSet = hashSetOf<Int>()
    for(n in nums) {
        if(hashSet.contains(n)) return true
        hashSet.add(n)
    }
    return false
}