import arrays.ContainsDuplicate
import arrays.TwoSum
import arrays.ValidParentheses

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    validParentheses()

}
fun printTwoSumResult(){
    val nums = intArrayOf(3,2,4)
    val target = 6

    val result = TwoSum().twoSum(nums,target)
    println("Resultado ${result[0]}, ${result[1]}")
}

fun printContainsDuplicate(){
    val nums = intArrayOf(3,2,4,2)
    val result = ContainsDuplicate().containsDuplicate(nums)
    println("Resultado: $result")
}

fun validParentheses(){
    val result = ValidParentheses().validParentheses("({[})")
    print("Resultado $result")
}