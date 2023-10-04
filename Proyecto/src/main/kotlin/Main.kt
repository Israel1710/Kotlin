class Cancion(val titulo: String, val artista: String, val duracion: String)

class ReproductorMusica(private val listaReproduccion: List<Cancion>) {
    private var cancionActual: Cancion? = null
    private var reproduciendo: Boolean = false

    fun reproducir(cancion: Cancion) {
        cancionActual = cancion
        reproduciendo = true
        println("Reproduciendo: ${cancion.titulo} - ${cancion.artista}")
    }

    fun detener() {
        if (reproduciendo) {
            println("Deteniendo la reproducción de: ${cancionActual?.titulo} - ${cancionActual?.artista}")
            reproduciendo = false
        } else {
            println("No hay canción en reproducción.")
        }
    }

    fun mostrarListaReproduccion() {
        println("Lista de Reproducción:")
        listaReproduccion.forEachIndexed { index, cancion ->
            println("${index + 1}. ${cancion.titulo} - ${cancion.artista} (${cancion.duracion})")
        }
    }
}

fun main() {
    val listaDeReproduccion = listOf(
        Cancion("Canción 1", "Artista 1", "3:45"),
        Cancion("Canción 2", "Artista 2", "4:20"),
        Cancion("Canción 3", "Artista 3", "2:55")
    )

    val reproductor = ReproductorMusica(listaDeReproduccion)

    reproductor.mostrarListaReproduccion()

    reproductor.reproducir(listaDeReproduccion[0])
    Thread.sleep(2000) // Simular la reproducción durante 2 segundos
    reproductor.detener()

    reproductor.reproducir(listaDeReproduccion[1])
    Thread.sleep(3000) // Simular la reproducción durante 3 segundos
    reproductor.detener()

    reproductor.reproducir(listaDeReproduccion[2])
    Thread.sleep(2500) // Simular la reproducción durante 2.5 segundos
    reproductor.detener()
}