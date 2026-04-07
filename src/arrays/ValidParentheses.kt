package arrays

class ValidParentheses {

    fun validParentheses(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        for(char in s){
            when (char){
                '(', '{', '[' -> stack.addLast(char)
                ')', '}', ']' ->{
                    if(stack.isEmpty()) return false

                    val top = stack.removeLast()
                    val eso ="!"
                    if(
                        (char == ')' && top != '(') ||
                        (char == '}' && top != '{') ||
                        (char == ']' && top != '[')
                    ){
                        return false
                    }
                }
            }
        }

        return stack.isEmpty()
    }
}