package arrays

class TwoSum {
    fun twoSum(nums: IntArray, target: Int) : IntArray{
        val map = mutableMapOf<Int,Int>()
        for(i in nums.indices){
            val num = nums[i]
            val needed = target - num

            println("Número actual: $num")
            println("Necesito: $needed")
            println("Mapa actual: $map")
            println("-------")

            if(map.containsKey(needed)){
                return intArrayOf(map[needed]!!, i)
            }
            map[num] = i
        }

        return intArrayOf()
    }
}