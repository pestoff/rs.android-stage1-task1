package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {

        val sumList = mutableListOf<Int>()

        for (i in input) {
            sumList.add( input.sum() - i )
        }

        return arrayOf(sumList.min()!!, sumList.max()!!).toIntArray()
    }
}
