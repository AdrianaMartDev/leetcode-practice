package arrays

class SumEqualsK {
//nums = [1, 1, 1]
    fun sumEqualsK(nums: IntArray, k: Int):Int{
        val map = mutableMapOf<Int, Int>()
        map[0] = 1

        var currentSum = 0
        var count =0
        for (num in nums){
            currentSum += num
            if(map.containsKey(currentSum - k)){
                count += map[currentSum - k]!!
            }

            map[currentSum] = map.getOrDefault(currentSum, 0)+1
        }

        return count
    }
}