import kotlin.math.pow
const val Pi = 3.1416F
const val PHI = 1.618f

fun main () {
    val radius = 4f
    val area = circleArea(radius)
    println("El area del circulo es: $area")
    println(getPi())
    printPHI()
}

fun circleArea(radius:Float): Float{
    return Pi*radius.pow(2)
}
fun getPi(): Float{
    return Pi
}
fun printPHI(){
    println("El numero aureo vale $PHI")
}

//Funciones locales