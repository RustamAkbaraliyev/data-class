

fun main(){

    val cat = Cat("Murzik", 7,"Blue")

    val (name,age,color) = cat
    println(name)
    println(age)
    println(color)

}

data class Cat(val name: String, val age: Int, val color: String)
