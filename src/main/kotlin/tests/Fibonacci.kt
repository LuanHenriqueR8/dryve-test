fun main() {
    val fibo = arrayListOf<Long>()

    for (i in 0..13) {
        if (fibo.isEmpty() || i == 1) fibo.add(1)
        else fibo.add(fibo[i.minus(1)] + fibo[i.minus(2)])
    }

    print(fibo.joinToString())
}