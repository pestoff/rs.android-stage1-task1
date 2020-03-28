package subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var changes = k;
        var result = ""
        val pairs = mutableListOf<String>()

        if (n < digitString.length) return "-1"

        for (i in 0 until digitString.length / 2) {
            pairs.add("${digitString[i]}${digitString[digitString.length- 1 - i]}")
        }

        for (index in pairs.indices) {
            val count = pairs.count { it.first() != it.last() }

            if (changes > count && pairs[index] != "99") {
                pairs[index] = "99"
                changes -= 2
            } else if (changes == count && pairs[index].first() != pairs[index].last() ){
                if (pairs[index].first() > pairs[index].last()) {
                    pairs[index] = pairs[index].first().toString().repeat(2)
                } else {
                    pairs[index] = pairs[index].last().toString().repeat(2)
                }
                changes -= 1
            } else if (changes < count) return "-1"
        }

        pairs.forEach {
            result += it.first()
        }

        return "$result${result.reversed()}"
    }
}
