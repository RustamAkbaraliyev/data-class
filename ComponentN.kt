
fun main(){

    val cat = Cat("Murzik", 7,"Blue")

    val name = cat.component1()
    val age = cat.component2()

    println("$name $age")

}

data class Cat(val name: String, val age: Int, val color: String)
