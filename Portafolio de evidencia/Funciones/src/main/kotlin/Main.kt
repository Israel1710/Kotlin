import java.awt.geom.Area

fun main(){
    val userValidate = login("Juanito", "Navaja")
    val promedio = promedio(valor3 = 10f)
    println("usauario loggeado? $userValidate")
    println("Area con valores por defecto: ${rectangleArea(height = 10.0)}")
    println("Area con datos determinados con named arguments: ${rectangleArea(height = 2.0, base = 30.0)}")
    println("El promedio del alumno es: $promedio")

    println("Ingresa el valor del lado 1: ")
    val lado1 = readLine()?.toInt()
    println("Ingresa el valor del lado 2: ")
    val lado2 = readLine()?.toInt()
    println("Ingresa el valor del lado 3: ")
    val lado3 = readLine()?.toInt()



}

fun login(user: String, password: String) : Boolean {
    fun validate(input: String): Boolean{
        if (input.isEmpty()) {
            return false
        }
        return true
    }
    val userValidate = validate(user)
    val passValidate = validate(password)

    return userValidate && passValidate
}

fun rectangleArea(base:Double = 20.0, height:Double = 30.0):Double{
    return base*height
}

fun promedio(valor1: Float = 8f, valor2: Float = 8f, valor3: Float): Float {
    return (valor1 + valor2 + valor3)/3
}

fun verifyAge(){
    println("Ingresa edad y presiona enter (escribe sólo el numero): ")
    val age = readLine()?.toInt()
}

 /*operadores
    If
    Else
    Else if
    When (Switch)

 */


fun tipoTriangulo(lado1:Int, lado2:Int, lado3:Int){

    if (lado1 == lado2 && lado3 == lado1){
        println("El triangulo es equilatero")
    }
    else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)){
        println("El triangulo es isoceles")
    }
    else {
        println("El tringulo es escaleno")
    }
}

fun tipoDato (dato: Any){
    when (dato) {
        is String -> println("EL dato es tipo String")
        is Int -> println("El dato es tipo Int")
        is Double -> println("El dato es tipo Double")
        else -> println("Tipo de dato no soportado")
    }
}

//Ciclos