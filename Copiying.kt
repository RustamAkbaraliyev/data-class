

fun main(){

    val cat = Cat("Murzik", 7,"Blue")
    val olderMurzik = cat.copy(age = 13)


}

data class Cat(val name: String, val age: Int, val color: String)
