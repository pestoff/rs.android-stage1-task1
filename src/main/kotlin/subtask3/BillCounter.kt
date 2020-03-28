package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val listBill = bill.toMutableList()
        listBill.removeAt(k)
        val difference = b - (listBill.sum() / 2)

        return if (difference == 0) "Bon Appetit" else difference.toString()
    }
}
