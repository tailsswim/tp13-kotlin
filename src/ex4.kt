fun filtrerEtTransformer(
    liste: List<Int>,
    transformation: (Int) -> Int,
    predicat: (Int) -> Boolean
): List<Int> {
    return liste.filter(predicat).map(transformation)
}

fun main() {
    val nombres = listOf(1, 2, 3, 4, 5, 6)
    val resultat = filtrerEtTransformer(
        nombres,
        transformation = { x -> x * x },
        predicat = { x -> x % 2 == 0 }
    )
    println(resultat)
}
