package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var input = sadArray.toMutableList()

        for (i in 1 until sadArray.size - 1) {
            if (sadArray[i] > sadArray[i + 1] + sadArray[i - 1] ) {
                input.remove(sadArray[i])
            }
        }

        if (isSadArray(input.toIntArray())) input = convertToHappy(input.toIntArray()).toMutableList()

        return input.toIntArray()
    }

    fun isSadArray(sadArray: IntArray): Boolean {
        for (i in 1 until sadArray.size - 1) {
            if (sadArray[i] > sadArray[i + 1] + sadArray[i - 1] ) {
                return true
            }
        }

        return false
    }
}
