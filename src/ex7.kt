fun rechercheRapide(liste: List<Int>, conditionRecherche: (Int) -> Boolean): Boolean {
    return liste.any(conditionRecherche)
}

fun main() {
    val maListeNombres = listOf(10, 20, 50, 120, 30)
    val existe = rechercheRapide(maListeNombres) { x -> x > 100 }
    println(existe)
}
