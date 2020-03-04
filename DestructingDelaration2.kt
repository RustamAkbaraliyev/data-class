

fun main(){

    val cat = Cat("Murzik", 7,"Blue")

    val (name,_,color) = cat

    println(name)
    println(color)
    

}

data class Cat(val name: String, val age: Int, val color: String)
