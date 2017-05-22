import com.rsk.Person

fun main(args: Array<String>) {
    println("Hello, World, printing to the console")

    val john = Person("John")


    println("Name is ${john.Name}")

    john.Name = "John C Makers"

    println("Name is now ${john.Name}")

    john.display()
            // :: means function reference, like Java
    john.displayWithLambda(::printName)

}

fun printName(name: String) {
    println(name)
}