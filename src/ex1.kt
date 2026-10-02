fun transformerListe(liste: List<Int>, transformation: (Int) -> Int): List<Int> {
    return liste.map(transformation)
}

fun main() {
    val maListe = listOf(1, 2, 3, 4)
    val resultat = transformerListe(maListe) { x -> x * 2 }
    println(resultat)
}
