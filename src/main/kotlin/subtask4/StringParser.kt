package subtask4

import java.util.*

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val result = mutableListOf<String>()
        val brackets = arrayOf("<>", "[]", "()")

        val bracketList = mutableListOf<Bracket>()

        for (index in inputString.indices) {
            if (brackets.any { it.first() == inputString[index] }) {
                bracketList.add(Bracket(brackets.first { it.first() == inputString[index] }, index, 0))
            }
            if (brackets.any { it.last() == inputString[index] }) {
                bracketList.last { it.type.last() == inputString[index] && it.endIndex == 0 }.endIndex = index
            }
        }

        bracketList.forEach { result.add(inputString.substring(it.startIndex + 1, it.endIndex )) }

        return result.toTypedArray()
    }

    class Bracket {
        public var type : String
        public var startIndex : Int
        public var endIndex : Int

        constructor(type: String, startIndex: Int, endIndex: Int) {
            this.type = type
            this.startIndex = startIndex
            this.endIndex = endIndex
        }
    }
}
