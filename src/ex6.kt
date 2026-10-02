fun manipulerChaines(
    listeChaines: List<String>,
    predicat: (String) -> Boolean,
    transformateur: (String) -> String
): List<String> {
    return listeChaines.filter(predicat).map(transformateur)
}

fun main() {
    val mots = listOf("Ananas", "Banane", "Avocat", "Cerise")
    val resultat = manipulerChaines(
        mots,
        predicat = { s -> s.startsWith("A", ignoreCase = true) },
        transformateur = { s -> s.uppercase() }
    )
    println(resultat)
}
