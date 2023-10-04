fun main(){
    val userValidate = login("Juanito", "Navaja")
    println("usauario loggeado? $userValidate")
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

