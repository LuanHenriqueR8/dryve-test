import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val sequence = arrayListOf<Long>()

    for (i in 1..7) {
        println("Enter a ${i}º number of sequence: ")
        sequence.add(scan.nextLong())
    }

    print(sequence.filter { it % 2L == 0L }.reduce { sum, current -> sum + current })
}