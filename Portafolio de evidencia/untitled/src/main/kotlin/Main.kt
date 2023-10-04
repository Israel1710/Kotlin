fun main( ) {
    val nombres = listOf(
        "Kirbi",
        "Ness",
        "Fox",
        "Luigi",
        "Mario",
        "Link",
        "Captain Falcon",
        "Samus",
        "Pikachu",
        "Jigglepuff",
        "Donkey Kong",
        "Yoshi")

    /*for (nombre in nombres) {
        println(nombre)
    }*/

    //nombres.forEach { println(it) }

    for (nombre in nombres){
        println(nombre)
        if (nombre == "Link"){
            println("Personaje encontrado")
            break
        }
    }
}

//mutable.listOf()
//list.add()
//list.remove()
//list



//val namesToAges: Map<String, Int> = mapOf("user_one" to 20, "user_teo" to 23)

//