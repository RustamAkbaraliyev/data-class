fun main(){

    val cat = Cat("Murzik", 7,"Blue")
    println(cat)

}

data class Cat(val name: String, val age: Int, val color: String)
