fun appliquerOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val addition = appliquerOperation(5, 3) { x, y -> x + y }
    val multiplication = appliquerOperation(5, 3) { x, y -> x * y }
    println(addition)
    println(multiplication)
}
