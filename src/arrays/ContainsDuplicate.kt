package arrays

class ContainsDuplicate {

    fun containsDuplicate(nums: IntArray): Boolean {
        val map = mutableSetOf<Int>()

        for(num in nums){
            if(map.contains(num)){
                return true
            }

            map.add(num)
        }

        return false
    }
}