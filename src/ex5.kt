fun appliquerOperationConditionnelle(
    liste: List<Int>,
    operation: (Int) -> Int,
    condition: (Int) -> Boolean
): List<Int> {
    return liste.map { element -> if (condition(element)) operation(element) else element }
}

fun main() {
    val donnees = listOf(2, 4, 6, 8)
    val resultat = appliquerOperationConditionnelle(
        donnees,
        operation = { x -> x + 10 },
        condition = { x -> x < 5 }
    )
    println(resultat)
}
