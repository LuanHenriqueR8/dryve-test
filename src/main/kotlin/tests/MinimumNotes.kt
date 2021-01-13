import java.lang.System.`in`
import java.util.*
import kotlin.collections.HashMap

fun main() {
    val bankNotes = arrayListOf(100, 50, 20, 10, 5, 2, 1)
    val minimumNotes = HashMap<Int, Int>()
    val scan = Scanner(`in`)

    println("Enter a amount: ")
    var amount = scan.nextInt()

    if (amount > 0) {
        bankNotes.forEach { note ->
            if (amount != 0 || note != 1) {
                val quantity = amount.div(note)
                minimumNotes[note] = quantity
                amount -= (quantity * note)
            } else minimumNotes[note] = amount
        }

        println("The minimum notes necessary to complete typed amount is: ")
        minimumNotes.keys.forEach { note -> if (minimumNotes[note] != 0) println("- ${minimumNotes[note]}x of $note") }

    } else println("Enter a valid amount!")
}