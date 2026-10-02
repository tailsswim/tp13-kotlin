import kotlin.system.measureTimeMillis

fun mesurerTemps(nomTache: String, bloc: () -> Unit) {
    val tempsEcoule = measureTimeMillis {
        bloc()
    }
    println("Tâche '$nomTache' exécutée en $tempsEcoule ms.")
}

fun main() {
    mesurerTemps("Calcul lourd") {
        var somme = 0L
        for (i in 1..10_000_000) {
            somme += i
        }
    }
}
